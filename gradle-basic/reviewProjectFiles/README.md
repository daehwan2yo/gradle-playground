## setting.gradle
`rootProject.name` 은 빌드의 이름을 정의하며, 후에 디렉토리 생성의 디폴트값.  
* 고정적인 이름을 선호한다.  
<img width="903" alt="스크린샷 2022-03-09 오후 7 25 31" src="https://user-images.githubusercontent.com/26921986/157423051-354dab78-c52c-4bae-bda6-71cb3dfb8ddc.png">



`include('app')` 은 현재 빌드가 실제코드와 빌드 논리를 포함하는  
'app' 이라는 이름의 하나의 서브 프로젝를 구성함을 알 수 있다.  
- 더 많은 서브 프로젝트들이 추가적인 include 를 통해 추가될 수 있다.  


## build.gradle
`plugins` : CLI application 을 빌드하는데 도움되는 플러그인들을 지정한다.  

`repositories` : mavenCentral() 로 부터 dependencies 를 제공받는다.

`dependencies` : 의존 받은 라이브러리들을 지정한다.  

`application` : 실행을 담당할 main 클래스를 정의한다.  
<img width="699" alt="스크린샷 2022-03-09 오후 7 25 58" src="https://user-images.githubusercontent.com/26921986/157423117-b8cc28e5-04f6-4f1d-ba9c-0b6eb9665927.png">


# Run the application
`./gradlew run`  
<img width="966" alt="스크린샷 2022-03-09 오후 7 27 07" src="https://user-images.githubusercontent.com/26921986/157423324-3161f15f-931d-44e9-b8a7-245e490a044a.png">

*처음 gradle을 실행하는 경우, version에 따른 설치가 진행되어 시간이 소요된다.  

# Bundle the application 
`./gradlew build`  
application plugin이 모든 dependencies와 함께 application을 bundle(묶어서) 제공한다.  
해당 번들에는 application을 single command 로 시작할 수 있는 스크립트도 함께 제공된다.  

# Publish a Build Scan
`./gradlew build --scan`   
빌드가 이면에서 무슨 작업을 수행하는지 보고싶다면, 해당 명령을 수행하면된다.  



