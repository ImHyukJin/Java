package Programmers;

import java.util.LinkedList;
import java.util.Queue;

class Solution {


    public static boolean canchange(String now , String target){
        int val = 0;

        for(int i= 0 ; i < now.length() ; i++){
            if(now.charAt(i)!=target.charAt(i)){
                val++;
            }
        }
        return val ==1 ;
    }
    public int solution(String begin, String target, String[] words) {
        //bfs로 1개씩 다른걸 연결고리로 사용
        int answer = 0 ; 
        int[] visited  = new int[words.length];
        //초기화
        Queue<Integer> que = new LinkedList<>();

        for(int i = 0 ; i < words.length ; i++){
            if(visited[i]==0 && canchange(begin,words[i])){
               que.add(i);   
               visited[i] = 1;     
            }
        }

        while(!que.isEmpty()){
            int val = que.poll();
            if(words[val].equals(target)){
                return visited[val];
            }

            visited[val]++;

            for(int i = 0 ; i < words.length ; i++){
                if(visited[i]==0 && canchange(words[val],words[i])){
                    que.add(i);
                    visited[i]= visited[val]+1;
                }
            }
        }
        

        return answer;
    }
}
