## jacoco 란?
Java Code Coverage library  
: jacoco 는 오픈소스로, java 코드의 coverage 율을 측정해준다.  

### Code Coverage
코드 커버리지는 소프트웨어의 테스트가 충분한가를 나타내는 지표 중 하나이다.  
코드가 얼마나 cover 되었는가를 나타낸다.  
-> 테스트를 진행했을때 코드 자체가 얼마나 실행되었는가?  
=> code coverage 가 높다라는 것은 작성한 코드들 중에 노는 코드가 적다는 의미이고,  
  이때 테스트가 전부 성공하게되면 커버리지 대상이 된 코드들에 대해 신뢰도가 형성된다고 보면된다.  


**구문, Statement**  
실행 코드라인이 한번 이상 실행되면 충족  

**조건, Condition**  
내부 조건이 참 혹은 거짓을 갖게되면 충족  

**결정, Decision**  
내부 조건자체보다는 전체 결과가 참 혹은 거짓이면 충족  

# Getting Started

## 1. jacoco plugin 을 지정한다.
이렇게 gradle plugin 만 지정해도 $buildDir/reports/jacoco/test 폴더에 커버리지 리포트가 HTML로 저장되게된다.  

## 2. 테스트와 코드 커버리지 리포트 생성 사이에 종속성을 추가한다.
`finalizedBy jacocoTestReport`  : 매번 test가 실행된 후에 report가 수행된다.  
`dependsOn test` : report 를 수행하기 전에 test 가 수행되어져야한다.  

## 3. jacoco plugin 구성
jacoco plugin 은 jacoco 라는 이름으로 jacocoPluginExtention 을 프로젝트 확장프로그램을 추가한다.  
따라서 이를 통해 jacoco 의 default 구성들이 설정되어지게 된다.  
`toolVersion` : jacoco 의 버전을 명시한다. (작성일 22-03-13 기준 0.8.7)  
`reportDirectory = layout.buildDirectory.dir('customJacocoReportDir')` : jacoco 의 빌드 디렉토리를 변경한다.  
(참고 : default dir : $buildDir/reports/jacoco)  

## 4. jacoco reports 구성
HTML, CSV, XML 등 파일을 지정할 수 있다.  

## 5. jacoco 결과를 측정하고 검증
JacocoCoverageVerification 은 설정한 규칙들을 바탕으로 코드 커버리지를 측정한다.  

`violationRules.rule.limit.minimum` : 최소 커버리지율을 제한한다. 해당 수치에 만족하지 못하는 경우 빌드가 실패하게된다.    
