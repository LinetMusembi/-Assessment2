fun main() {
sentence()
    println( privacy("linet26musembi"))
    multiply()
    var currentAccount = CurrentAccount(234567,"savings",4567.89)
    println( currentAccount.deposit(3400.50))
    println( currentAccount.withdraw(1500.50))
    println( currentAccount.details())


}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)

fun sentence() {
    var x = "AkiraChix"
    println(x.length)

}

//2.Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)
fun privacy(password:String):Boolean{
  var password = "linet26mus"
  if (password>="8characters"){
      return true
  }
    if (password>"16charactes"){
        return true
    }
    if (password=="password"){
        return false
    }
    if (password !== "digit"){
        return false
    }
    else{
        return true
    }



}
//3.Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multiply(){
    for( numbers in (1..1000))
    if (numbers%6==0 && numbers%8==0){
        println("Bingo")
    }
    else if (numbers%6==0){
        println("$numbers is a multiple of 6")
    }
    else if (numbers%8==0){
        println("$numbers is a multiple of 8")
    }
    else
        println(numbers)




}
//4.Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)

open class CurrentAccount(var accountNumber:Int,var accountName:String,var balance:Double){
    fun deposit(amount:Double):Double{
        var  x = amount+balance
        return x
    }
    fun withdraw(amount: Double):Double{
     var y = balance-amount
        return y


    }
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }
}

//5.Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)

class SavingsAccount(accountNumber: Int,accountName: String,boolean: Boolean):CurrentAccount{

}



