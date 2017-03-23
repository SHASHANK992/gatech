package opt.example;

import util.linalg.Vector;
import opt.EvaluationFunction;
import shared.Instance;

/**
 * @author Jacob Kilver
 * @version 1.0
 */
public class JRKFitnessFunctionThree implements EvaluationFunction {
    /**
     * @see opt.EvaluationFunction#value(opt.OptimizationData)
     */
    public double value(Instance d) {
        Vector data = d.getData();
        double val = 0;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) == 1) {
                val++;
            }
		}
		if(data.get(0) == data.get(data.size()-1))
		{
			val+=data.size();
		}
				
        return val;
    }
}