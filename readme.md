# memory leak test

- memory leak 지점 파악 경험
- 실제 memory leak이 발생하는 서비스를 해결
- 부하테스트를 통한 memory leak

사용 tool

메모리 프로파일링 도구:  Visual VM

부하테스트 도구: k6

### phase 1.

- memory leak을 재현을 위한 간단한 api endpoint 제작
    - cache를 만료 시키지 않고 무한으로 생성 - 기현
    - static 변수 vs 객체 내 맴버변수를 무한으로 만들기 - 훈희
- 부하테스트를 통한 상황 재현

### phase 2.

- 오리들 프로젝트에 실제 적용 - 훈희
- memory leak 버그가 있는 오픈소스 버전을 이용한 테스트 - 기현