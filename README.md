# spring-boot-session-destroy

Usage: send in a http GET request to ```/hello```

## 1. excepted behavior after session timeout (10 seconds):

#### 1.1 logs
```
c.e.sessionlisteners.SessionScopeBean    : destroy
c.e.s.HttpSessionListenerImpl            : session destroyed
```

#### 1.2 redis
keys * should return no data

## 2.1 actual behavior when running in eclipse IDE
#### 2.1.1 logs
missing ```c.e.sessionlisteners.SessionScopeBean    : destroy```
#### 2.1.2 redis
spring:session:sessions[UUID] stays forever

## 2.2 actual behavior when running ```gradle bootRun```
#### 2.2.1 logs
missing both
```
c.e.sessionlisteners.SessionScopeBean    : destroy
c.e.s.HttpSessionListenerImpl            : session destroyed
```

#### 2.2.2 redis
all records stay forever