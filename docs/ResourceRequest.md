
# ResourceRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**description** | **String** |  |  [optional]
**uri** | **String** | URI of Resource | 
**unit** | **String** | Time unit of resource to monitor such as daily, or hourly |  [optional]
**timezone** | **String** | Timezone of resource time, that is, timezone of %Y-%m-%d for hdfs://path/to/%Y-%m-%d such as +09:00 |  [optional]
**spanInDays** | **Integer** | Time span of resource to monitor, default is 32 |  [optional]
**consumable** | **Boolean** | True if this resource should be consumed |  [optional]
**notifiable** | **Boolean** | True if this resource should be notified, that is, monitor agent is not necessary |  [optional]



