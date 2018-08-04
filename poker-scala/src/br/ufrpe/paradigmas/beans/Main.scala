package br.ufrpe.paradigmas.beans
import scala.io.Source

object Main {
    
  def main(args: Array[String]) {
     } 
  
  
    
//função que compara o valor atual com o array para saber se é o primeiro valor(head) ou o último(tail)
   def valorAtual(atual: Int, cartas: List[Int]): Int ={
     
      if(atual == 0){
      
          cartas.head //é o primeiro valor da mão de poker lido na linha do arquivo 
      }
        else{
          
            valorAtual(atual-1, cartas.tail)
    }
  }
   
//checa se está em sequencia  
   def sequencia(cartas: List[Int]): Boolean ={
     
     if(cartas.length == 1){
      true// falta incrementar uma variável que conta o valor e cospe no arquivo
    }
        else{
          
      if(cartas.head != valorAtual(1, cartas)-1){
      false
    }
        else{ 
      sequencia(cartas.tail)
    }
  }
 }
     
//checar se 4 números são iguais
   def iguais(cartas: List[Int]): Boolean ={
     
    if(cartas.head == valorAtual(3, cartas) || (valorAtual(1, cartas) == valorAtual(4, cartas)))//se a cabeça for igual a posi 3 das cartas ou a primeira com a 4 posição
    {
      
        true // falta incrementar uma variável que conta o valor
      }
          else{
      false
    }
  }

//checar se todas são diferentes
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