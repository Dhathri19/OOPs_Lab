class fibonacci{
	
	public static void main(String args[]){
	
	int first = 0;
	int second = 1;
	int next = 0;
	int i = 1;
	
	while(i <= 100){
		if(i > next){
			next = first + second;
			first = second;
			second = next;
		}
		if(i == next){
			i += 1;
			continue;
		}
		else{
			System.out.println(i);
		}
		
		i += 1;
	}
	
	}	
}