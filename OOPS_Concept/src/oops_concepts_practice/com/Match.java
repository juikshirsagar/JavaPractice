package oops_concepts_practice.com;

//the class which declared with abstract keyword is abstract class
	abstract class Match {
		
		//declared with protected in super class can be accessed only by the subclasses 
		protected int  currentScore;
		protected float currentOver;
		protected int targetScore;
	
	//to provide common method implementation to all the subclasses
	abstract  float calculateRunrate() ;
	abstract int calculateBalls();
	
	 public void display(double reqRunRate,int balls)  {
			
		 }
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	public float getCurrentOver() {
		return currentOver;
	}
	public void setCurrentOver(float currentOver) {
		this.currentOver = currentOver;
	}
	public int getTargetScore() {
		return targetScore;
	}
	public void setTargetScore(int targetScore) {
		this.targetScore = targetScore;
	}
	 
	 
	 }
