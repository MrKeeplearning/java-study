# 인터페이스를 활용한 간단한 dao 구현

* DB에 회원 정보를 넣는 dao(data access object)를 여러 DB 제품이 지원될 수 있도록 구현한다.

* 환경파일(db.properties) 에서 데이터베이스의 종류에 대한 정보를 읽고 그 정보에 맞게 dao 인스턴스를 생성하여 실행될 수 있게 한다.

* 전체 구조

	![image](https://user-images.githubusercontent.com/27791880/151813551-fe96aa45-d049-40d6-8765-7b8c90e54ef1.png)