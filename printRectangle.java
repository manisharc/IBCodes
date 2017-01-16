import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class printRectangle {
	public static ArrayList<ArrayList<Integer>> prettyPrint(int a)
	{
		int listSize = 2*a-1;
	        ArrayList<ArrayList<Integer> > design = new ArrayList<ArrayList<Integer> >();
		for(int i = 0; i < listSize; ++i)
		{
			design.add(new ArrayList<Integer>(listSize));
			for(int j = 0; j < listSize; ++j)
			{
				design.get(i).add(0);
			}
		}

		for(int i = 0; i < a; ++i)
		{
			Integer value = a - i;

			//fill top row
			int rowIdx = i;
			int colStart = i;
			int colEnd = listSize - i;
			for(int j = colStart; j < colEnd; ++j)
			{
				design.get(rowIdx).set(j, value);
			}

			//fill bottom row
			rowIdx = listSize-i-1;
			for(int j = colStart; j < colEnd; ++j)
			{
				design.get(rowIdx).set(j, value);
			}


			//fill left col
			int colIdx = i;
			int rowStart = i;
			int rowEnd = listSize - i;
			for(int j = rowStart; j < rowEnd; ++j)
			{
				design.get(j).set(colIdx, value);
			}

			//fill right col
			colIdx = listSize - i - 1;
			for(int j = rowStart; j < rowEnd; ++j)
			{
				design.get(j).set(colIdx, value);
			}
		}

		return design;
	}

	public static void main(String[] args)
    	{

	        int p1 = Integer.parseInt(args[0]);
	        ArrayList<ArrayList<Integer> > design = prettyPrint(p1);

		for(ArrayList<Integer> arr : design)
		{
			System.out.println(arr);
		}
	}
}

