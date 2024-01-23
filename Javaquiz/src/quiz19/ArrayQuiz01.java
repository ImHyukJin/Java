package quiz19;

import java.util.Arrays;

public class ArrayQuiz01 {

	public static void main(String[] args) {
		
		//프로그래머스 문제 
		/*
		 * participant는 달리기 참가자 명단
		 * completion 딜리기 완주자 명단
		 * 
		 * completion 항상 participant 길이가 1명 작습니다.
		 * 완주하지 못한 사람의 이름을 찾아서 반환하는 solution메서드
		 */
		String[] participant = {"홍길동", "홍길자", "이순신", "신사임당"};
		String[] completion = {"홍길자", "신사임당", "이순신"};
		
		System.out.println( solution(participant, completion)  );
		
	}
	
	public static String solution(String[] participant, String[] completion) {
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i = 0; i < completion.length; i++) {
			if( !participant[i].equals(completion[i])  ) {
				return participant[i];
			} 
		}
		
		return participant[participant.length -1];
	}
	
	
	
	
	
}
