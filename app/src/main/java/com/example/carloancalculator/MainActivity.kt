package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculator.setOnClickListener(){
            //val amount:Double = txtAmount.text.toString().toDouble()
            //val result:Double = amount * 0.12345
            val carPrice:Double = editTextCarPrice.text.toString().toDouble()
            val downPayment:Double = editTextDownPayment.text.toString().toDouble()
            val loanPeriod:Int = editTextLoanPeriod.text.toString().toInt()
            val interestRate:Double = editTextInterestRate.text.toString().toDouble()

            val carLoan:Double = carPrice - downPayment
            val interest:Double = carLoan * interestRate * loanPeriod
            val monthlyRepayment:Double = (carLoan + interest) / loanPeriod / 12
            //viewResult.text = "Car Loan : RM %.2f".format(result)
            textViewLoan.text = "Car Loan : RM %.2f".format(carLoan)
            textViewInterest.text = "Interest : RM %.2f".format(interest)
            textViewMonthlyRepayment.text = "Monthly Repayment: RM %.2f".format(monthlyRepayment)
        }


    }
}
