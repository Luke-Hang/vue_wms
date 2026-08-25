variable "resource_group_name" {
  description = "Name of the Azure resource group for the WMS application."
  type        = string
  default     = "rg-wms"
}

variable "location" {
  description = "Azure region where the resource group will be created."
  type        = string
  default     = "eastasia"
}

variable "app_service_plan_name" {
  description = "Name of the Azure App Service Plan for the WMS application."
  type        = string
  default     = "asp-wms-free"
}

variable "app_service_plan_sku" {
  description = "Pricing tier for the Azure App Service Plan."
  type        = string
  default     = "F1"
}

variable "web_app_name" {
  description = "Globally unique name of the Azure Linux Web App."
  type        = string
  default     = "wms-app-580"
}

variable "web_app_java_version" {
  description = "Java version used by the Azure Linux Web App runtime."
  type        = string
  default     = "8"
}

variable "web_app_java_server" {
  description = "Java server type used by the Azure Linux Web App runtime."
  type        = string
  default     = "JAVA"
}

variable "web_app_java_server_version" {
  description = "Java server version used by the Azure Linux Web App runtime."
  type        = string
  default     = "8"
}

variable "tags" {
  description = "Tags applied to Azure resources."
  type        = map(string)
  default = {
    project     = "wms"
    environment = "dev"
  }
}
