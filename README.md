## 자바 공부
Chapter 6.1 객체지향 언어

- 객체지향언어는 기존의 프로그래밍 언어에 몇 가지 새로운 규칙을 추가한 보다 발전된 형태의 것.

- 이러한 규칙들을 이용해서 코드 간에 서로 관계를 맺어 줌으로써 보다 유기적인 프로그램을 구성하는 것.

- 객체지향언어의 주요 특징

    * 코드의 재사용성이 높다.

    * 코드의 관리가 용이하다.

    * 신뢰성이 높은 프로그래밍을 가능하게 한다.

        : 제어자와 메서드를 이용해서 데이터를 보호하고 올바른 값을 유지하도록 하며, 코드의 중복을 제거하여 코드의 불일치로 인한 오동작을 방지할 수 있다.

- 객체지향언어의 가장 큰 장점은 "코드의 재사용성이 높고 유지보수가 용이하다."는 것이다.

- 앞으로 상속, 다형성과 같은 객체지향개념을 학습할 때 재사용성과 유지보수 그리고 중복된 코드의 제거, 이 세 가지 관점에서 보면 보다 쉽게 이해할 수 있을 것이다.

Chapter 6.2 클래스와 객체

- 클래스란 '객체를 정의해놓은 것.' 또는 클래스는 '객체의 설계도 또는 틀' 이라고 정의할 수 있다. 클래스는 객체를 생성하는데 사용되며, 객체는 클래스에 정의된 대로 생성된다.

클래스

객체

제품 설계도

제품

TV 설계도

TV

붕어빵 기계

붕어빵

​

- 객체를 사용한다는 것은 객체가 가지고 있는 속성과 기능을 사용한다는 뜻이다.

​

Chapter 6.3 객체의 구성요소 - 속성과 기능

​

- 객체는 속성과 기능, 두 종류의 구성요소로 이루어져 있으며, 일반적으로 객체는 다수의 속성과 다수의 기능을 갖는다.

- 객체가 가지고 있는 속성과 기능을 그 객체의 멤버(구성원, member)라 한다.

​

​

속성 (Property) ---> 멤버변수(Variable)

기능(Function) ---> 메서드(Method)

​

채널 ---> int channel

채널 높이기 ---> channelUp() {...}

​

- Tv 클래스

​

class Tv {
    String color; // 색깔
    boolean power; // 전원 상태
    int channel; // 채널
// => 속성 : 크기, 길이, 높이, 색상, 볼륨, 채널 등

    void power() {power = !power;}
    void channelUp() {channel++;}
    void channelDown() {channel--;}

// => 기능 : 켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널 변경 등
}
Chapter 6.4 객체와 인스턴스

​

- 클래스로부터 객체를 만드는 과정을 클래스의 인스턴스화(Instantiate)라고 하며, 어떤 클래스로부터 만들어진 객체를 그 클래스의 인스턴스(Instance)라고 한다.

- 예를 들면, Tv 클래스로부터 만들어진 객체를 Tv 클래스의 인스턴스라고 한다.

- 결국 인스턴스는 객체와 같은 의미이지만, 객체는 모든 인스턴스를 대표하는 포괄적인 의미를 갖고 있다.

- 인스턴스는 어떤 클래스로부터 만들어진 것잊리르 보다 강조하는 의미를 갖고 있다.

- 예를 들면, '책상은 인스턴스다.' 라고 하기보다는 '책상은 객체다.' 라는 쪽이, '책상은 책상 클래스의 객체이다.' 라고 하기보다는 '책상은 책상 클래스의 인스턴스다.' 라고 하는 것이 더 자연스럽다.

​

Chapter 6.6 객체의 생성과 사용

​

- Tv 클래스를 선언한 것은 Tv 설계도를 작성한 것에 불과하므로, Tv 인스턴스를 생성해야 제품(Tv)을 사용할 수 있다. 클래스로부터 인스턴스를 생성하는 방법은 여러 가지가 있지만 일반적으로는 다음과 같이 한다.

클래스명 변수명; // 클래스의 객체를 참조하기 위한 참조변수를 선언
변수명 = new 클래스명(); // 클래스의 객체를 생성 후 , 객체의 주소를 참조변수에 저장

Tv t; // Tv 클래스 타임의 참조변수 t를 선언
t = new Tv(); // Tv 인스턴스를 생성한 후 , 생성된 Tv 인스턴스의 주소를 t에 저장
package OOPExample;

public class OOPExample1 {
	
	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		
		System.out.println("현재 채널은 " + t.channel + "입니다.");
	}
}

class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() { power =!power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
}
​

1. Tv t;

: Tv 클래스 타입의 참조변수 t를 선언한다. 메모리에 참조변수 t를 위한 공간이 마련된다. 아직 인스턴스가 생성되지 않았으므로 이 참조변수로 할 수 있는 것은 아무것도 없다.

​

2. t = new Tv();

: 연산자 new에 의해 Tv 클래스의 인스턴스가 메모리의 빈 공간에 생성된다. 주소가 0x100인 곳에 생성되었다고 가정하다. 이 때 멤버변수는 각 자료형에 해당하는 기본값으로 초기화 된다.

color는 참조형이므로 null로, power는 boolean이므로 false로, 그리고 channel은 int 이므로 0으로 초기화 된다.

color : null

power : false

channel : 0

power()

channelUp()

channelDown()

(메모리 구조를 표로 나타낸 것,참조변수 t는 위 메모리의 주소를 참조한다.)

​

3. t.channel = 7;

​

color : null

power : false

channel : 7

power()

channelUp()

channelDown()

- 참조변수 t에 저장된 주소에 있는 인스턴스의 멤버변수 channel에 7을 저장한다.

​

4. t.channelDown();

- 참조변수 t가 참조하고 있는 Tv 인스턴스의 channelDown 메서드를 호출한다. channelDown 메서드는 멤버변수 channel에 저장되어 있는 값을 1 감소시킨다.

void channelDown() { --channel; }
- channelDown()에 의해서 channel의 값은 7에서 6이 된다.

color : null

power : false

channel : 6

power()

channelUp()

channelDown()

​

- 인스턴스는 참조변수를 통해서만 다룰 수 있으며, 참조변수의 타입은 인스턴스의 타입과 일치해야 한다.

Chapter6.9 클래스의 정의(1) - 데이터와 함수의 결합

​

- 프로그래밍적인 관점에서 클래스의 정의와 의미

- 프로그래밍언어에서의 데이터 처리를 위한 데이터 저장형태의 발전 과정

​

변수 - 배열 - 구조체 - 클래스

​

1. 변수 : 하나의 데이터를 저장할 수 있는 공강
2. 배열 : 같은 종류의 여러 데이터를 하나의 집합으로 저장할 수 있는 공간
3. 구조체 : 서로 관련된 여러 데이터를 종류에 관계없이 하나의 집합으로 저장할 수 있는 공간
4. 클래스 : 데이터와 함수의 결합(구조체 + 함수)
​

​

- 하나의 데이터를 저장하기 위해 변수를, 그리고 같은 종류의 데이터를 보다 효율적으로 다루기 위해서 배열이라는 개념을 도입했으며, 후에는 구조체(Structure)가 등장하여 자료형의 종류에 상관없이 서로 관계가 깊은 변수들을 하나로 묶어서 다룰 수 있도록 했다.

- 그 동안 데이터와 함수가 서로 관계가 없는 것처럼 데이터는 데이터끼리, 함수는 함수끼리 따로 다루어져 왔지만, 사실 함수는 주로 데이터를 가지고 작업을 하기 때문에 많은 경우에 있어서 데이터와 함수는 관계가 깊다.

- 그래서 자바와 같은 객체지향언어에서는 변수(데이터)와 함수를 하나의 클래스에 정의하여 서로 관계가 깊은 변수와 함수들을 함께 다룰 수 있게 했다.

​

Chapter 6.11 선언위치에 따른 변수의 종류

​

- 변수는 클래스 변수, 인스턴스 변수, 지역변수 모두 세 종류가 있다. 변수의 종류를 결정짓는 중요한 요소는 '변수의 선언 위치' 이므로 변수의 종류를 파악하기 위해서는 변수가 어느 영역에 선언되었는지를 확인하는 것이 중요하다.

- 멤버변수를 제외한 나머지 변수들은 모두 지역 변수이며, 멤버변수 중 static이 붙은 것은 클래스 변수, 붙지 않은 것은 인스턴스 변수이다.

​

class Variables {
    int iv; // 인스턴스 변수
    static int cv; // 클래스 변수
    ////// 클래스 영역

    void method()
   {
       int lv = 0; // 지역변수
   }
   /////// 메서드 영역
}
변수의 종류

선언위치

생성시기

클래스 변수

(Class Variable)

클래스 영역

클래스가 메모리에 올라갈 때

인스턴스 변수

(Intance Variable)

인스턴스가 생성되었을 때

지역 변수

(Local Variable)

클래스 영역 이외의 영역

(메서드, 생성자, 초기화 블럭 내부)

변수 선언문이 수행되었을 때

​

1. 인스턴스 변수

    - 클래스 영역에 선언되며 인스턴스를 생성할 때 만들어진다.

    - 인스턴스 변수의 값을 읽어 오거나 저장하려면 먼저 인스턴스를 생성해야 한다.

    - 인스턴스마다 별도의 저장 공간을 가지므로 서로 다른 값을 가질 수 있다.

    - 인스턴스마다 고유한 상태를 유지해야하는 속성의 경우, 인스턴스 변수로 선언한다.

​

2. 클래스 변수

    - 클래스 변수를 선언하는 방법은 인스턴스 변수 앞에 static을 붙이기만 하면 된다.

    - 인스턴스마다 독립적인 저장공간을 갖는 인스턴스 변수와는 달리, 클래스 변수는 모든 인스턴스가 공통된 저장공간(변수)를 공유하게 된다.

    - 한 클래스의 모든 인스턴스들이 공통적인 값을 유지해야하는 속성의 경우, 클래스 변수로 선언해야 한다.

​

3. 지역 변수

- 메서드 내에 선언되어 메서드 내에서만 사용 가능하며, 메서드가 종료되면 소멸되어 사용할 수 없게 된다.

- for문 또는 while문의 블럭 내에 선언된 지역 변수는, 지역변수가 선언된 블럭 {} 내에서만 사용 가능하며, 블럭을 벗어나면 소멸되어 사용할 수 없게 된다.
