output "resource_group_name" {
  description = "The name of the created resource group."
  value       = azurerm_resource_group.wms.name
}

output "resource_group_location" {
  description = "The Azure region of the created resource group."
  value       = azurerm_resource_group.wms.location
}

output "resource_group_id" {
  description = "The Azure resource ID of the created resource group."
  value       = azurerm_resource_group.wms.id
}

output "app_service_plan_name" {
  description = "The name of the created App Service Plan."
  value       = azurerm_service_plan.wms.name
}

output "app_service_plan_sku" {
  description = "The pricing tier of the created App Service Plan."
  value       = azurerm_service_plan.wms.sku_name
}

output "app_service_plan_id" {
  description = "The Azure resource ID of the created App Service Plan."
  value       = azurerm_service_plan.wms.id
}

output "web_app_name" {
  description = "The name of the created Azure Linux Web App."
  value       = azurerm_linux_web_app.wms.name
}

output "web_app_default_hostname" {
  description = "The default hostname of the created Azure Linux Web App."
  value       = azurerm_linux_web_app.wms.default_hostname
}

output "web_app_url" {
  description = "The HTTPS URL of the created Azure Linux Web App."
  value       = "https://${azurerm_linux_web_app.wms.default_hostname}"
}
