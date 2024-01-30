package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    //dfs 
    //모든 항공권 사용
    //알파벳 사전순
    //백트래킹 - 사전순으로 들어가다 모든 항공권 사용이 불가능 할 수 있따.
    static boolean visited[] ;
    static ArrayList<String> list;
    static String[][] tickets;
    
    
    
    public String[] solution(String[][] tickets) {
        this.tickets = tickets;
        String[] answer = new String[tickets.length+1];

        list = new ArrayList<>();
        
        //사전순으로 정렬시켜주기
        Arrays.sort(tickets , (a,b) -> {
            if(a[0].equals(b[0])){
                return a[1].compareTo(b[1]);
            }else {
                return a[0].compareTo(b[0]);
            }
        });

        //초기화 
        visited = new boolean[tickets.length];
        
        list.add("ICN");
        dfs("ICN" ,list , 0);
        
        //list에 받아옴
        for(int i = 0 ; i <list.size() ; i++){
            answer[i] = list.get(i);

        }


        return answer;
    }

    private static  void dfs(String boarding , ArrayList<String> alist , int dephts){
       list = new ArrayList<>();
        //dfs탈출 조건

        //백트래킹 탈출조건
        if(dephts== tickets.length){
            list.addAll(alist);
            return;
        }
        //구현동작

        for(int i = 0 ; i < tickets.length ; i++){
            if(!visited[i] && boarding.equals(tickets[i][0])){
                visited[i] =true;
                list.addAll(alist);
                list.add(tickets[i][1]);
               dfs(tickets[i][1], list , dephts +1);
               visited[i] = false;
            }
        }
    }
}