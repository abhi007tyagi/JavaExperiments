/**
 * 
 */
package tyagiabhinav.codility;

/**
 * @author abhinavtyagi
 *
 */
public class GenomicRangeQuery {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindImpactFactor factor = new FindImpactFactor();
		factor.getMinImpact("CAGCCTA", new int[]{2,5,0}, new int[]{4,5,6});
	}
}

class FindImpactFactor{
	
	// using prefix sum approach
	public int[] getMinImpact(String S, int[] P, int[] Q){
		int[] result = new int[P.length];

        int A[] = new int[S.length()+1];
        int C[] = new int[S.length()+1];
        int G[] = new int[S.length()+1];

        for (int i = 0; i < S.length(); i++) {
            A[i+1] = A[i] + (S.charAt(i) == 'A' ? 1 : 0);
            C[i+1] = C[i] + (S.charAt(i) == 'C' ? 1 : 0);
            G[i+1] = G[i] + (S.charAt(i) == 'G' ? 1 : 0);
            System.out.print(A[i+1]+" "+C[i+1]+" "+G[i+1]);
            System.out.println();
        }

        for (int i = 0; i < P.length; i++) {
            int a = A[Q[i] + 1] - A[P[i]];
            int c = C[Q[i] + 1] - C[P[i]];
            int g = G[Q[i] + 1] - G[P[i]];
            System.out.println("a="+a+" c="+c+" g="+g);
            result[i] = a>0 ? 1 : c>0 ? 2 : g>0 ? 3 : 4;
        }

        return result;
	}
	
	public int[] getMinImpactFactor(String S, int[] P, int[] Q){
		int size = P.length;
		int[] result = new int[size];
		
		
		for(int i=0; i<size; i++){
			int min = 100000;
			String temp = (String)S.subSequence(P[i], Q[i]+1);
//			System.out.println("Temp "+ temp);
			if(temp.indexOf('A') != -1){
				min = Math.min(min, 1);
			}
			if(temp.indexOf('C') != -1){
				min = Math.min(min, 2);
			}
			if(temp.indexOf('G') != -1){
				min = Math.min(min, 3);
			}
			if(temp.indexOf('T') != -1){
				min = Math.min(min, 4);
			}
			
			result[i] = min;
			System.out.print(result[i]+ " ");
		}
		return result;
	}
	
	private int getImpact(char ch){
		switch(ch){
			case 'A':
				return 1;
			case 'C':
				return 2;
			case 'G':
				return 3;
			case 'T':
				return 4;
		}
		return -1;
	}
}