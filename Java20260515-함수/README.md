# Java20260515-함수 — 함수(메소드) · 매개변수 · 반환값 · 오버로딩

> 📅 2026-05-15 | 🧭 [전체 로드맵으로](../README.md) | ◀ 이전: [배열](../Java20260514-배열/README.md) | ▶ 다음: [클래스 입문](../Java20260515-클래스/README.md)

똑같은 코드를 복사·붙여넣기하던 문제를 **함수(메소드)** 로 해결합니다.
함수의 4가지 형태(매개변수·반환값 유무 조합)를 하나씩 확인하고,
마지막으로 같은 이름의 함수를 여러 개 만드는 **오버로딩**을 배웁니다.

---

## 1. 이 프로젝트에서 배우는 것

- 함수가 필요한 이유 — 중복 제거, 재사용, 가독성
- 함수 구조: `반환타입 함수명(매개변수) { ... return 값; }`
- 함수 호출(function call)과 실행 흐름
- **인자(argument)** 와 **매개변수(parameter)**
- `void`와 `return`
- 매개변수/반환값 유무에 따른 **4가지 형태**
- **함수 오버로딩(Overloading)** 성립 조건

## 2. 폴더 구조

```
Java20260515-함수/src/ex01/
├── FunctionEx01.java   같은 출력 4번 복붙 (함수 없이)
├── FunctionEx02.java   info() 함수로 묶기 — 매개변수 X, 반환 X
├── FunctionEx03.java   add(int, int) → int  — 매개변수 O, 반환 O
├── FunctionEx04.java   add(double, double)   — 매개변수 O, 반환 X
├── FunctionEx05.java   add() → int           — 매개변수 X, 반환 O
├── FunctionEx06.java   add()                 — 매개변수 X, 반환 X
├── FunctionEx07.java   add / thrid / four / dadd  (이름이 제각각)
└── FunctionEx08.java   전부 add 로 통일 → 오버로딩
```

## 3. 학습 흐름

```mermaid
flowchart LR
    A[Ex01<br/>복붙 코드] -->|중복 제거| B[Ex02<br/>info 함수]
    B --> C[Ex03~06<br/>함수 4가지 형태]
    C --> D[Ex07<br/>비슷한 함수 이름 4개]
    D -->|이름 통일| E[Ex08<br/>오버로딩]
```

---

## 4. 예제별 상세

### FunctionEx01 → FunctionEx02 · 함수가 필요한 이유
```java
// Ex01: 같은 4줄을 4번 반복 (16줄)
System.out.println("안녕하세요!!");
System.out.println("제 이름은 김대철입니다.");
System.out.println("천호동에서 살고 있습니다.");
System.out.println("장래 희망은 놀고 먹는것입니다.");
...
```
```java
// Ex02: 함수로 묶고 이름(info)으로 호출
public static void main(String[] args) {
    info();          // 함수 호출
    info();
    ...
}
//     반환타입 함수명 (매개변수)
static void  info  () {
    System.out.println("안녕하세요!!");
    ...
}
```
내용을 바꿔야 할 때 **한 곳만 고치면** 됩니다. 실행 결과는 Ex01과 동일합니다.

> `static`을 붙이는 이유: `main`이 `static`이므로, 객체를 만들지 않고 바로 호출하려면 `static` 함수여야 합니다.
> (자세한 내용은 [클래스 0518 ex07](../Java20260518-클래스/README.md)에서 다룹니다.)

### 함수의 4가지 형태 (Ex03 ~ Ex06)

| 파일 | 매개변수 | 반환값 | 시그니처 | 결과 |
|---|:---:|:---:|---|---|
| FunctionEx03 | O | O | `static int add(int num1, int num2)` | `두 수 합 : 5` |
| FunctionEx04 | O | X | `static void add(double num1, double num2)` | `두 수 합 : 3.7` |
| FunctionEx05 | X | O | `static int add()` | `두 수 합 : 7` |
| FunctionEx06 | X | X | `static void add()` | `두 수 합 : 7` |

**FunctionEx03 — 실행 흐름**
```java
int a = 3, b = 2;
int total = add(a, b);            // ① a, b 값(인자)을 복사해 전달
                                  // ④ 반환된 5를 total 에 저장
static int add(int num1, int num2) {   // ② num1=3, num2=2 (매개변수)
    int sum = num1 + num2;
    return sum;                   // ③ 호출한 곳으로 값 돌려주기
}
```

**FunctionEx04 — `void`와 `return;`**
```java
static void add(double num1, double num2) {
    double sum = num1 + num2;
    System.out.println("두 수 합 : " + sum);   // 결과를 직접 출력
    return;    // void 함수의 return 은 생략 가능 (함수 종료 의미)
}
```

**어떤 형태를 쓸까?**
- 결과를 **다른 곳에서 다시 쓰려면** → 반환형(`int add(...)`)
- 함수 안에서 **출력까지 끝내면** → `void`
- 일반적으로 계산 함수는 **반환형**이 재사용성이 높습니다. (→ [클래스 ex03 → ex04](../Java20260515-클래스/README.md)에서 같은 변화가 나옵니다)

### FunctionEx07 · 이름이 제각각인 함수들
```java
static int    add  (int a, int b)               { return a + b; }
static double dadd (double a, double b)         { return a + b; }
static int    thrid(int a, int b, int c)        { return a + b + c; }
static int    four (int a, int b, int c, int d) { return a + b + c + d; }
```
모두 "더하기"인데 이름을 4개나 기억해야 합니다.

### FunctionEx08 · 오버로딩 ⭐
```java
static int    add(int a, int b)               { return a + b; }
static double add(double a, double b)         { return a + b; }
static int    add(int a, int b, int c)        { return a + b + c; }
static int    add(int a, int b, int c, int d) { return a + b + c + d; }

add(10, 2);          // → add(int, int)
add(10, 5, 9);       // → add(int, int, int)
add(1.2, 5.2);       // → add(double, double)
```
**실행 결과** (Ex07과 동일)
```
12
24
29
6.4
```

**오버로딩 성립 조건** (코드 주석 정리)
| 조건 | 성립 여부 |
|---|---|
| 함수 이름이 같다 | 필수 |
| 매개변수 **개수**가 다르다 | ✅ |
| 매개변수 **타입**이 다르다 | ✅ |
| 반환 타입**만** 다르다 | ❌ (반환 타입은 상관없음 = 구분 기준이 아님) |

---

## 5. 핵심 개념 정리

```
 반환타입   함수명   매개변수 목록
   ↓        ↓          ↓
static int  add  (int num1, int num2) {
    return num1 + num2;     ← 반환값 (반환타입과 일치해야 함)
}
```
- **인자 → 매개변수** 로 값이 **복사**되어 전달됩니다 (기본형 기준).
- 함수 안에서 선언한 변수(`sum`)는 **지역 변수** — 함수가 끝나면 사라집니다.
- `return`을 만나면 그 즉시 함수가 종료됩니다.

## 6. 주의할 점

- `FunctionEx07`의 `thrid`는 `third`의 오타입니다 (동작에는 영향 없음).
- 주석에 "두 정수를 입력받아서"라고 되어 있지만 실제로는 값이 코드에 고정되어 있습니다. 입력을 받으려면 `Scanner`를 사용합니다 ([FirstJava ex04](../FirstJava/README.md)).

## 7. 연결

- ▶ 다음 단계: [클래스 입문](../Java20260515-클래스/README.md) — 함수가 **데이터와 함께** 클래스 안으로 들어갑니다.
- 오버로딩은 **생성자 오버로딩**([클래스 0518 ex05](../Java20260518-클래스/README.md))으로 그대로 이어지고,
  상속에서는 이름이 비슷한 **오버라이딩**([상속 ex06](../Java20260519-상속/README.md))과 비교됩니다.
