package oops_concepts_practice.com;

public class ODIMatch extends Match{

	public ODIMatch(int score, float over, int target) {

	super.currentScore=score;

	super.currentOver=over;

	super.targetScore=target;
	}
	@Override
	float calculateRunrate() {
		int balls=this.calculateBalls();
		float rr=((super.targetScore-super.currentScore)/(float)(balls)*6); 
		rr =Float.parseFloat(String.format("%.3f", rr)); 
		return rr;
	}

	@Override
	int calculateBalls() {
		String s= new Float(super.currentOver).toString();
		String p=s.substring(s.indexOf(".")+1,s.length());

		int balls=Integer.parseInt(p);

		balls=300-(balls+((int)super.currentOver*6));

		return balls;

	}

}
