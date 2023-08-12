# 아이스크림 만들기

> 함수를 이용하여 아이스크림 모양을 출력하기

### 출력시 화면
```
***********
***********
***********
***********
***********
***********
***********
***********
    | |
    | |
    | |
    | |
```

___

### 순서도
![Icecream](https://github.com/minsik321/tset/assets/141251335/7eea3756-99f9-45fb-a2cb-b73125f9316a)

___

### 트러블 슈팅
아이스크림 막대 부분이
```
| |
| |
| |
| |
``` 

이처럼 출력 된다고 들어서 기존의 출력 부분인 `System.out.printf("%5s%2s\n", "|","|");` 을
`System.out.println("    | |");` 이처럼 변경 하였습니다.

# STEP 3: 주문에 따른 빼빼로 그리기

> 함수를 이용하여 주문에 따른 빼빼로 모양을 출력하기

### 출력시 화면

<img width="600" alt="스크린샷 2023-08-12 오후 1 44 25" src="https://github.com/KiodingReaders/basic-starter1/assets/141251335/3020b705-3ea2-4be5-b58e-b626c3eb80fe">

<img width="600" alt="스크린샷 2023-08-12 오후 1 45 33" src="https://github.com/KiodingReaders/basic-starter1/assets/141251335/66815d66-6662-414e-9a8e-c2da868e9007">

<img width="600" alt="스크린샷 2023-08-12 오후 1 45 53" src="https://github.com/KiodingReaders/basic-starter1/assets/141251335/e8f76f0c-83d3-4caa-9bc6-761dd3866603">

<img width="600" alt="스크린샷 2023-08-12 오후 1 46 09" src="https://github.com/KiodingReaders/basic-starter1/assets/141251335/2c582c5e-2d2b-48d9-b3d2-65357565e2aa">

<img width="600" alt="스크린샷 2023-08-12 오후 1 46 33" src="https://github.com/KiodingReaders/basic-starter1/assets/141251335/70f44b6f-82ed-4e5d-bf57-4a3bb072863d">

<img width="600" alt="스크린샷 2023-08-12 오후 1 46 47" src="https://github.com/KiodingReaders/basic-starter1/assets/141251335/aee53bcd-10e5-44ec-9d08-5467f74f9fad">


___

## 순서도
![PeperoFlowchart drawio](https://github.com/minsik321/tset/assets/141251335/9a5a8a84-ba50-473f-ac33-cf495f75b6c2)


___

## 개선점

- 서로 다른 객체의 내용에 대해 동일시 하려는 경우에는 같은 type의 객체로 선언해야 함.
- 빼빼로의 길이와, 토핑이 바뀔 수도 있다고 생각하고, 모든 경우를 만들어 두는 게 아닌 커멘트 라인에서 길이, 토핑, 바디 를 모두 입력 받는 구조로 바꿈.
- input 을 할 때 마다 값을 처리 하는 방식이 아닌 한 번에 input을 받아서 처리 하는 방식으로 바꿈.
- 여러개의 빼빼로를 동시에 출력 받는 형식으로 바꿈.
- 메서드를 사용함으로써 중복되는 부분을 줄여 로직을 단순화 시킴.


___

## 트러블 슈팅
### 몸통 모양에 띄어쓰기를 넣기 위함
- `sc.next();` 를 `sc.nextline();` 으로 수정함
<br>

### `sc.nextline();` 사용시 다음 input 입력값이 무시됨
- `sc.nextline();` 를 `sc2.nextline();` 으로 수정함
___

## 학습 키워드

- 요청에 따른 출력물을 만들 수 있도록 한다.
- 중복 되는 부분은 메서드화 시킨다.
- 로직을 단순화 하여 가독성을 좋게 만든다.

___