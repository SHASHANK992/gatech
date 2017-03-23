package opt.example;

import util.linalg.Vector;
import opt.EvaluationFunction;
import shared.Instance;

/**
 * @author Jacob Kilver
 * @version 1.0
 */
public class JRKFitnessFunctionTwo implements EvaluationFunction {
    /**
     * @see opt.EvaluationFunction#value(opt.OptimizationData)
     */
    public double value(Instance d) {
        Vector data = d.getData();
        double c_groups = 1;
		double max_group = 0;
		// Count number of groups of same digit
        for (int i = 0; i < data.size()-1; i++) {
            if (data.get(i) == data.get(i+1)) {
                c_groups++;
            }
			if(c_groups > max_group)
			{
				max_group = c_groups;
			}
        }
				
        return max_group;
    }
}