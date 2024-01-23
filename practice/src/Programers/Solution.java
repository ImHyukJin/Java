	package Programers;
	
	
	import java.util.*;
	class Solution {
		//max 거리 구하고 그 갯수 
		//최단거리 bfs
		public int solution(int n, int[][] edge) {
			int answer = 0;
			boolean[] visited= new boolean[edge.length+1];
			int[] distance = new int[edge.length+1];
			//초기화
			ArrayList<ArrayList> list = new ArrayList<>();
			for(int i = 0 ; i < edge.length; i++){
				list.add(new ArrayList<Integer>());
			}
	
			for(int i = 0 ; i < edge.length ; i++){
				list.get(edge[i][0]).add(edge[i][1]);
				list.get(edge[i][1]).add(edge[i][0]);
			}
	
			//bfs 
			Queue<Integer> que = new LinkedList<>();
			que.add(1);
			visited[1] =true;
			distance[1] = 0;
			while(!que.isEmpty()){		
				int v = que.poll();
				ArrayList<Integer> list1 = list.get(v);
				for(int i = 0 ; i < list1.size() ; i++) {
					if(!visited[list1.get(i)]) {
						que.add(list1.get(i));
						visited[list1.get(i)] = true;
						distance[list1.get(i)]= distance[v]+1;
					}
				}
			}
	
				Arrays.sort(distance);
				int max = distance[distance.length-1];
	
				for(int i = 0 ; i==max ; i++){
					answer++;
				}
	
				return answer;
			}
		}