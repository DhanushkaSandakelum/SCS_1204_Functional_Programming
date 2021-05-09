object bookShop extends App{
  var pricePerBook = 24.95*0.4;
  def total(x:Int):Double = if(x < 50) {x*(pricePerBook + 3)} else {50 * (pricePerBook + 3) + (x-50)*(pricePerBook + 0.75)};

  println(total(60));
}
