# 그래들 최초 생성과정

**reference**  
https://docs.gradle.org/current/samples/sample_building_java_applications.html


<img width="494" alt="스크린샷 2022-03-09 오전 12 15 19" src="https://user-images.githubusercontent.com/26921986/157267184-0ba48e6c-784d-4b06-8cd4-42f20cf7774c.png">

> gradle init 을 통해 gradle 프로젝트를 최초로 초기화한다.

<img width="1269" alt="스크린샷 2022-03-09 오전 12 17 41" src="https://user-images.githubusercontent.com/26921986/157267666-722a4df2-4c6c-4a7a-9159-329436899c2a.png">

**result**
<img width="1255" alt="스크린샷 2022-03-09 오전 12 18 19" src="https://user-images.githubusercontent.com/26921986/157267794-5003ca5b-244f-437c-ad4d-be5514a04e43.png">

## gradle-wrapper
https://docs.gradle.org/current/userguide/gradle_wrapper.html

선언된 버전의 gradle을 호출하여 필요한 경우 다운로드를 수행하는 스크립트,  
이로써 개발자는 별도로 수동의 설치 없이 gradle 만으로도 빠르게 프로젝트 빌드와 수행이 가능하다.

<img width="793" alt="스크린샷 2022-03-09 오전 12 25 26" src="https://user-images.githubusercontent.com/26921986/157269132-e128c8a9-0581-4b35-96ab-046d278561af.png">


운영체제에 따라 `gradlew` 혹은 `gradlew.bat` 을 실행한다.  
이유는 안정적이고 표준화된 빌드를 위해 gradle-wrapper로 빌드하는 것을 권장하기 때문이다.

<img width="618" alt="스크린샷 2022-03-09 오전 12 29 39" src="https://user-images.githubusercontent.com/26921986/157269977-cc4291e8-a9f3-4cdc-a141-526910d118d8.png">

## setting.gradle
root project와 sub project에 대한 정의를 하기 위함

## build.gradle
application 에 대한 구체적인 `build script`들의 모음. task 로 구성되어있다.
