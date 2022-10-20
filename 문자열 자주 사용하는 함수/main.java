
// === 문자열 자주 사용하는 함수 ===

// 대문자, 소문자 판별
for (char x : str.toCharArray()) {
	if (Character.isLowerCase(x)) {
		answer += Character.toUpperCase(x);
	} else if (Character.isUpperCase(x)) {
		answer += Character.toLowerCase(x);
	}
}


// Character 타입 판별

// 알파벳 판별
if (Character.isAlahabetic(str)) {
	rt--;
}

// 숫자 판별
if (Character.isDigit(c)) {
	answer += c;
}

// 특정 단어 인덱스 값, 인덱스 값에 위치한 단어
str.indexOf('W')
str.charAt(i)


//String to Character Array
char[] c = str.toCharArray();


// 알파벳만 필터링
str = str.toUpperCase().replaceAll("[^A-Z]", "");


// 문자열 거꾸로
String tmp = StringBuilder(str).reverse().toString();


// 문자열 비교
str.equals(tmp);			// true, false


// 문자열 나누기
str = str.substring(7)			// 인덱스 7 위치 이후로 가져옴
str = str.substring(5, 12)		// 인덱스 5부터 12까지 가져옴


// StringBuffer : 문자열을 추가하거나 변형할 때 주로 사용하는 자료형
// StringBuffer, StringBuilder는 String의 한계(concat을 사용하면 성능 저하)를 극복하기 위해 사용
// String은 기본적으로 불변하기 때문에 값을 추가할 때 기존 값을 버리고 새로 할당함

StringBuffer sb = new StringBuffer();		// StringBuffer 객체 sb 생성
sb.append("hello");			// 값 추가
sb.insert(0, "hello ");		// 값 삽입
sb.substring(0, 4);			// 문자열 나누기
sb.reverse();				// 순서 뒤집기
sb.toString();				// String 형태로 변경		

// ==== 알고리즘 공략 ====

// 대소문자 구분을 안한다 - 이런 전제 조건이 있다면 반드시 소문자든, 대문자든 한쪽으로 공용화 시켜줌


// 필터 조건 (숫자를 제외한다, 기호를 제외한다)
// 문자열을 Character 타입으로 변환 후에 is 함수 또는 if 조건문을 통해 걸러준다


// 중복 문자 - indexOf 함수는 맨 처음에 발견한 것을 가져오기에 중복을 제거하는 데 유용하다
for (int i = 0; i < str.length(); i++) {
	if (i == str.indexOf(str.charAt(i))) {
		answer += str.charAt(i);
	}
}

// 문자열 => 숫자 : Integer.valueOf 함수를 사용하면 맨 앞에 0인 문자열이더라도 자동으로 제거하여 int형으로 바꿔줌


// 문자열 속 두 개의 문자 관계를 유추할 때 :
// 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.	
// two point 전략으로 접근하는 것도 좋은 방법.
