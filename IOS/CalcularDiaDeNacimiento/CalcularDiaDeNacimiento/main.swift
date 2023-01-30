//
//  main.swift
//  CalcularDiaDeNacimiento
//
//  Created by Mañanas on 18/2/21.
//
import Foundation

print("Dia de nacimiento")
var d:Int = Int(readLine()!)!

print("Mes de nacimiento")
var m:Int = Int(readLine()!)!

print("Año de nacimiento")
var y:Int = Int(readLine()!)!

if m == 1 {
    m = 13
} else if m == 2{
    m = 14
}

var op1:Int = (m + 1) * 3 / 5
var op2:Int = y / 4
var op3:Int = y / 100
var op4:Int = y / 400

var op5:Int = d + (m * 2)  + y + op1 + op2 - op3 + op4 + 2

var op6:Int = op5 / 7

var op7:Int = op5 - (op6 * 7)

switch op7{
case 0:
    print("Sábado")
case 1:
    print("Domingo")
case 2:
    print("Lunes")
case 3:
    print("Martes")
case 4:
    print("Miercoles")
case 5:
    print("Jueves")
case 6:
    print("Viernes")
default:
    print("IDK")
}
