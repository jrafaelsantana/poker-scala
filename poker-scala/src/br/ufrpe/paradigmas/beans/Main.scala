package br.ufrpe.paradigmas.beans
import scala.io.Source

object Main {
    
  def main(args: Array[String]) {
   
  //teste leitura das linhas dos arquivos  
  Source.fromFile("src/br/ufrpe/paradigmas/utils/poker2K.txt" ).foreach{ 
   print 
   }
  }
   
  //valores das cartas do baralho
  def baralho(cartas: Char): Int = {
    cartas match {
      case 'A' => 1
      case '2' => 2
      case '3' => 3
      case '4' => 4
      case '5' => 5
      case '6' => 6
      case '7' => 7
      case '8' => 8
      case '9' => 9
      case 'T' => 10
      case 'J' => 11
      case 'Q' => 12
      case 'K' => 13
      
    }
  }
  
  
    //leitura das linhas do arquivo para ordenação
  def ordenarBaralho(mao: List[String]): List[String] = {
    mao.sortWith(
      (x, y) => (
        baralho(String.valueOf(x).charAt(0)) < baralho(String.valueOf(y).charAt(0))))
  }
  
  
}