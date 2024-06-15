


using System;

public class Desafio
{
    public static void Main()
{

    float valorSalario = float.Parse(Console.ReadLine());
     Console.WriteLine("Digite o sálario: ");
    float valorBeneficios = float.Parse(Console.ReadLine());
     Console.WriteLine("Digite o valor do benefício: ");

    float valorImposto = 0;
    if(valorSalario >= 0 && valorSalario <= 1100)
    {
        valorImposto = 0.5F * valorSalario;
    }else if(valorSalario >= 1100 && valorSalario <= 2500)
    {
        valorImposto = 0.10F * valorSalario;
    } else{
        valorImposto = 0.15F * valorSalario;
    }

    float saida = valorSalario - valorImposto + valorBeneficio;
        Console.WriteLine(saida.ToString("0.00"));
}    
}