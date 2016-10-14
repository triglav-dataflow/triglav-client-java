
# UserResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  | 
**name** | **String** |  | 
**description** | **String** |  |  [optional]
**authenticator** | [**AuthenticatorEnum**](#AuthenticatorEnum) | local or ldap |  [optional]
**groups** | **List&lt;String&gt;** |  |  [optional]
**email** | **String** |  |  [optional]
**createdAt** | [**DateTime**](DateTime.md) |  |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) |  |  [optional]


<a name="AuthenticatorEnum"></a>
## Enum: AuthenticatorEnum
Name | Value
---- | -----
LOCAL | &quot;local&quot;
LDAP | &quot;ldap&quot;



