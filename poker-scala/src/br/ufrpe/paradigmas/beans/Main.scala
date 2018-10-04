package br.ufrpe.paradigmas.beans
import scala.io.Source

object Main {
    
  def main(args: Array[String]) {
     } 
  
  
    
//fun��o que compara o valor atual com o array para saber se � o primeiro valor(head) ou o �ltimo(tail)
   def valorAtual(atual: Int, cartas: List[Int]): Int ={
     
      if(atual == 0){
      
          cartas.head //� o primeiro valor da m�o de poker lido na linha do arquivo 
      }
        else{
          
            valorAtual(atual-1, cartas.tail)
    }
  }
   
//checa se est� em sequencia  
   def sequencia(cartas: List[Int]): Boolean ={
     
     if(cartas.length == 1){
      true
    }else{
      if(cartas.head != valorAtual(1, cartas)-1){
      false
    }
        else{ 
      sequencia(cartas.tail)
    }
  }
 }
     
//checar se 4 n�meros s�o iguais
   def iguais(cartas: List[Int]): Boolean ={
     
    if(cartas.head == valorAtual(3, cartas) || (valorAtual(1, cartas) == valorAtual(4, cartas)))//se a cabe�a for igual a posi 3 das cartas ou a primeira com a 4 posi��o
    {
        true
      }
          else{
      false
    }
  }

//checar se todas s�o diferentes
  def diferentes(cartas: List[Int]): Boolean ={
    
     if(cartas.length == 1){
       true
     }
         else{
           
               if(cartas.head == valorAtual(1,cartas)){
         false
       }
               else {
                       diferentes(cartas.tail)
       }
     }
   }
  
  
}