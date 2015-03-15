package Interest;

public class FixedInterestRate {

	/*
	 * ====================================================================
	 * Licensed to the Apache Software Foundation (ASF) under one or more
	 * contributor license agreements. See the NOTICE file distributed with this
	 * work for additional information regarding copyright ownership. The ASF
	 * licenses this file to You under the Apache License, Version 2.0 (the
	 * "License"); you may not use this file except in compliance with the
	 * License. You may obtain a copy of the License at
	 * 
	 * http://www.apache.org/licenses/LICENSE-2.0
	 * 
	 * Unless required by applicable law or agreed to in writing, software
	 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
	 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
	 * License for the specific language governing permissions and limitations
	 * under the License.
	 * ====================================================================
	 */

	/**
	 * 
	 * pmt function returns the payment amount for a loan based on an interest
	 * rate and a constant payment schedule
	 *
	 * @param r
	 *            - The interest rate for the loan
	 * @param n
	 *            - The number of payments for the loan
	 * @param p
	 *            - The present value or principal of the loan
	 * @param f
	 *            - Optional. It is the future value or the loan amount
	 *            outstanding after all payments have been made. If this
	 *            parameter is omitted, the pmt function assumes a f value of 0.
	 * @param t
	 *            - Optional. It indicates when the payments are due. 1 means
	 *            payment are due at the beginning of each period (each month,
	 *            for example) 0 means payment at the end of each period.
	 * 
	 *            Code Source:
	 *            http://svn.apache.org/repos/asf/poi/trunk/src/java
	 *            /org/apache/poi/ ss/formula/functions/FinanceLib.java
	 * 
	 * 
	 *            Explanation Source:
	 *            https://th.answers.yahoo.com/question/index
	 *            ?qid=20080822070859AAY94ZT
	 * 
	 */
	public static double pmt(double r, double n, double p, double f, boolean t) {
		double retval = 0;
		if (r == 0) {
			retval = -1 * (f + p) / n;
		} else {
			double r1 = r + 1;
			retval = (f + p * Math.pow(r1, n)) * r
					/ ((t ? r1 : 1) * (1 - Math.pow(r1, n)));
		}
		return retval;
	}

}
