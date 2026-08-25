terraform {
  required_version = ">= 1.6.0"

  required_providers {
    azurerm = {
      source  = "hashicorp/azurerm"
      version = "~> 3.116"
    }
  }
}

provider "azurerm" {
  features {}
}

resource "azurerm_resource_group" "wms" {
  name     = var.resource_group_name
  location = var.location

  tags = var.tags
}

resource "azurerm_service_plan" "wms" {
  name                = var.app_service_plan_name
  location            = azurerm_resource_group.wms.location
  resource_group_name = azurerm_resource_group.wms.name
  os_type             = "Linux"
  sku_name            = var.app_service_plan_sku

  tags = var.tags
}

resource "azurerm_linux_web_app" "wms" {
  name                = var.web_app_name
  location            = azurerm_resource_group.wms.location
  resource_group_name = azurerm_resource_group.wms.name
  service_plan_id     = azurerm_service_plan.wms.id
  https_only          = true

  site_config {
    always_on = false

    application_stack {
      java_server         = var.web_app_java_server
      java_server_version = var.web_app_java_server_version
      java_version        = var.web_app_java_version
    }
  }

  tags = var.tags
}
