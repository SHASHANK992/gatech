package opt.example;

import util.linalg.Vector;
import opt.EvaluationFunction;
import shared.Instance;

/**
 * @author Jacob Kilver
 * @version 1.0
 */
public class JRKFitnessFunctionOne implements EvaluationFunction {
    /**
     * @see opt.EvaluationFunction#value(opt.OptimizationData)
     */
    public double value(Instance d) {
        Vector data = d.getData();
        double val = 0;
        for (int i = 0; i < data.size(); i+=2) {
            if (data.get(i) == data.get(0)) {
                val++;
            }
		}
				
        return val;
    }
}