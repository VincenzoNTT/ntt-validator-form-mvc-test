# ntt-validator-form-mvc-test



## Usage

Aggiungere al pom.xml il riferimento :  

```
<dependencies>
    
    .....

    <dependency>
        <groupId>com.nttdata.validator.form</groupId>
        <artifactId>nttdata-validator-form-mvc</artifactId>
        <version>1.0.0</version>
    </dependency>
   
    .....
           
</dependencies>
```

## Annotation

Class: UserRegistrationDto  

@FieldMatch.List({  
        @FieldMatch(baseField = "password", matchField = "confirmPassword", message = "The password fields must match"),  
        @FieldMatch(baseField = "email", matchField = "confirmEmail", message = "The email fields must match")  
})  
public class UserRegistrationDto {}  


@ValidPassword  
private String password;  

@Phone  
private String phone;  

