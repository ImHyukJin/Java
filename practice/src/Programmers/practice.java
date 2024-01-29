package Programmers;

class practice {

    static int answer;
    static boolean[] visited;
    static String[] words;
    //한번에 한개 - 같은단어 아니어도 이동가능 , 이동가능한 단어가(즉 1개만 다른 단어가) 중복될 수 있음

    public static void dfs(int num , String now , String target){
        //탈출조건
        if(now.equals(target)){
            answer = Math.min(num,answer);
            return;
        }
        //구현동작

        for(int i = 0 ; i < words.length ; i++){
            if(!visited[i]&& canchange(words[i], target)){
                visited[i] = true;
                dfs(num+1 , words[i],target);
                visited[i] = false;
            }
        }
    }

    public static boolean canchange(String now , String target){
        int val = 0;

        for(int i = 0 ; i < now.length() ; i++ ){
            if(now.charAt(i) != target.charAt(i)){
                val++;
            }
        }
        return val==1;
    }

    public int solution(String begin, String target, String[] words) {
        //값이 있는지 없는지
        this.words = words;
        boolean bool = false;

        for(int i = 0 ; i < words.length ; i++){
            if(target.equals(words[i])){
                bool = true;
            }
        }

        if(!bool){
            return 0;
        }


        for(int i = 0 ; i < words.length ; i++){
            if(canchange(begin,words[i])){
                visited = new boolean[words.length];
                visited[i]= true;
                dfs(1, words[i],target);
            }
        }
        return answer;
    }

}