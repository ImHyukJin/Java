package Programmers;
class Solution {
     static int answer = Integer.MAX_VALUE;
     static boolean[] visited;
     static String words[];
     //주요 조건
    //dfs, 한 단어 차이인가? -갯수 갯수만큼의 answer에서 answer가 가장 낮은 것 

    public static void dfs(int num , String now , String target){
        //탈출조건
        if(now.equals(target)){
            answer = Math.min(answer,num);
            return;
        }

        //구현동작
        for(int i = 0 ; i <words.length ; i++){
            if(!visited[i] && canchange(now, words[i])){
                visited[i]= true;
                dfs(num+1 , words[i],target);
                visited[i]= false;
            }
        }

    }
    public static boolean canchange(String now, String target){
       int canchange = 0;

       for(int i = 0 ; i < now.length() ; i++){
        if(now.charAt(i) != target.charAt(i)){
            canchange++;
        }
       }

        return canchange == 1;
    }
    
    public int solution(String begin, String target, String[] words) {
        this.words = words;
        boolean val = false;
        for(String a : words){
            if(a.equals(target)){
                val = true;
            }
        }
        if(!val){
            return 0;
        }

        for(int i = 0 ; i < words.length;i++){
            //한 단어 차이인 단어마다 다 dfs 돌기,visited 도 단어마다
            if(canchange(begin, words[i])){
                visited = new boolean[words.length];
                visited[i] = true;
                dfs(1 , words[i] , target);
            }
        }
       
        return answer;
    }
}