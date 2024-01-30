package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

//dfs
//주어진 항공권 모두 사용
//중복된 항공권이 있는지? 
//출발지가 같으면 사전순으로 
//사전순으로 돌았을 때 안되면 백트래킹해서 되는 것을 찾자 << dfs인 이유 
//백트래킹해야되니 depts를 dfs에서 받아야되고 현재 값을 보존하자.
class Solution {
    static String[][] tickets;
    static boolean[] visited;
    static StringBuilder sb= new StringBuilder() ; 
    static ArrayList<String> list = new ArrayList<>();

    public String[] solution(String[][] tickets) {
        this.tickets = tickets;

        visited = new boolean[tickets.length];

        String[] answer = new String[tickets.length+1];

        Arrays.sort(tickets , (a,b) ->{
            if(a[0].equals(b[0])){
               return a[1].compareTo(b[1]);
            }else {
                return a[0].compareTo(b[0]);
            }
        });

       
        dfs("ICN" , "ICN" , 0);

        String result = list.get(0);
        StringTokenizer st = new StringTokenizer(result);
        

        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = st.nextToken();
        }

        return answer;
    }   

    public static void dfs(String takeoff,String route ,int depths){
         sb = new StringBuilder();
        //dfs탈출조건
       
        //백트래킹 탈출조건
        if(depths == tickets.length){
           list.add(route);
            return;
        }
        //구현동작

        for(int i =  0 ; i < tickets.length ; i++){
            if(!visited[i] && tickets[i][0].equals(takeoff)){
                visited[i] = true;
                sb.append(route).append(" ").append(tickets[i][1]);
                dfs(tickets[i][1],sb.toString() , depths+1);
                visited[i]= false;
            }
        }
    }
}