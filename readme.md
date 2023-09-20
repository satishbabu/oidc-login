# A simple OIDC Spring client

This is a simple spring oidc client with 2 end points

* First is for the home page, and it is open to everyone
``` 
http://localhost:8080/ 
```

* Second URL is secured using the Twitter
``` 
http://localhost:8080/secured
```


## Setup
Go to Twitter, login and click Settings/Developer settings.  Create a 'New OAuth App' and generate Client ID and secret.  
Enter the client ID and client secret onto application.properties