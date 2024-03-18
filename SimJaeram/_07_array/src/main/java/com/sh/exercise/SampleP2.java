package com.sh.exercise;

class SampleP2 {                                                                    // SampleP2 클래스 정의 시작
    public static void main(String[] args) {                                        // main() 메소드 정의 시작
        int[] test;                                                                 // int형 배열에 대한 레퍼런스 변수 test 선언
        test = new int[5];                                                          // 변수 test에 int형 데이터를 저장하는 크기가 5인 배열 생성 후 대입

        test[0] = 80;                                                               // 배열 test의 인덱스 0번째 요소에 80 대입
        test[1] = 60;                                                               // 배열 test의 인덱스 1번째 요소에 60 대입
        test[2] = 22;                                                               // 배열 test의 인덱스 2번째 요소에 22 대입
        test[3] = 50;                                                               // 배열 test의 인덱스 3번째 요소에 50 대입
        test[4] = 75;                                                               // 배열 test의 인덱스 4번째 요소에 100 대입
//        test[5] = 100;                                                            // 배열 test의 크기가 5이므로 인덱스는 0부터 4까지이다. 인덱스의 범위를 벗어났다.

        for(int i = 0; i < 5; i++) {                                                // int형 변수 i 선언 동시에 0 대입하여 초기화, i가 5보다 작을 동안 반복, i에 +1
            System.out.println((i + 1) + "번째 사람의 점수는 " + test[i] + "입니다.");  // System.out.println() 메소드 호출하여 배열 test에 저장된 요소 출력, i+1번째 사람의 점수
        }                                                                           // for문 끝
    }                                                                               // main() 메소드 정의 끝
}                                                                                   // SampleP2 클래스 정의 끝
