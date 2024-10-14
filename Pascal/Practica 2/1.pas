{1.- Implementar un programa que invoque a los siguientes modulos.
a. Un modulo recursivo que retorne un vector de a lo sumo 15 numeros enteros 'random'   mayores a 10 y menores a 155 (incluidos ambos). La carga finaliza con 
el valor 20.
b. Un modulo no recursivo que reciba el vector generado en a) e imprima el contenido del vector.
c. Un modulo recursivo que reciba el vector generado en a) e imprima el contenido del vector.
d. Un modulo recursivo que reciba el vector generado en a) y devuelva la suma de los valores pares contenidos en el vector.
e. Un modulo recursivo que reciba el vector generado en a) y devuelva el maximo valor del vector.
f. Un modulo recursivo que reciba el vector generado en a) y un valor y devuelva verdadero si dicho valor se encuentra en el vector o falso en caso contrario.
g. Un modulo que reciba el vector generado en a) e imprima, para cada numero contenido en el vector, sus digitos en el orden en que aparecen en el numero. 
Debe implementarse un modulo recursivo que reciba el numero e imprima lo pedido. Ejemplo si se lee el valor 142, se debe imprimir 1  4  2
}

Program Clase2MI;
const dimF = 15;
      min = 10;
      max = 155;
type vector = array [1..dimF] of integer;
     
procedure CargarVectorRecursivo (var v: vector; var dimL: integer);
var 
  valor: integer;
begin
  valor:= min + random (max - min + 1);
  if ((valor <> 20 ) and (dimL < dimF)) then begin
    dimL:= dimL + 1;
    v[dimL]:= valor;
    CargarVectorRecursivo (v, dimL);
  end;
end;
  
procedure CargarVector (var v: vector; var dimL: integer);
begin
  dimL:= 0;
  CargarVectorRecursivo (v, dimL);
end;
 
procedure ImprimirVector (v: vector; dimL: integer);
var
  i: integer;
begin
  for i:= 1 to dimL do
    writeln ('Posicion numero ',i,' tiene cargado el valor: ',v[i]);
End;     

procedure ImprimirVectorRecursivo (v: vector; dimL: integer);
begin
  if diml<>0 then begin 
    writeln ('Posicion numero ',diml,' tiene cargado el valor: ',v[diml]);
    diml:=diml-1;
    ImprimirVectorRecursivo (v,diml);
  end;
end; 
 
function SumarRecursivo (v: vector; pos, dimL: integer): integer;
var
  par:integer; 
Begin
  if (pos <= dimL) then begin
    if v[pos] mod 2=0 then begin
      par:=v[pos];
    end
    else begin
      par:=0;
    end;
    SumarRecursivo:= SumarRecursivo (v, pos + 1, dimL) + par; 
  end 
  else
    SumarRecursivo:=0  
  End; 
    
function Sumar (v: vector; dimL: integer): integer;  
var
  pos: integer; 
begin
 pos:= 1;
 Sumar:= SumarRecursivo (v, pos, dimL);
end;


Procedure obtenermaximo (v:vector; dl: integer; var max: integer);
begin
  if dl<>0 then begin
    if max<v[dl] then begin
      max:=v[dl];
    end;
    obtenermaximo (v,dl-1,max)
  end;
end;

procedure vof (v: vector; dl,valor: integer; var x:boolean);
begin
  if dl<>0 then begin
    if v[dl]=valor then
      x:=true
    else  
    vof (v,dl-1,valor,x);
  end;
end;

procedure leernumero (x:integer);
begin
  if x div 10<>0 then begin
    leernumero (x div 10);
    writeln (x mod 10);
  end
  else
    writeln (x);
end;

procedure descomponer (v:vector; dl: integer);
begin
  if dl<>0 then begin
    leernumero (v[dl]);
    writeln ('Numero en la posicion ',dl, ' descompuesto');
    descomponer (v,dl-1);
  end;
end;
var 
  dimL, suma, maxim, valor: integer; 
  v: vector;
  encontre: boolean;
Begin 
  CargarVector (v, dimL);
  if (dimL = 0) then 
    writeln ('--- Vector sin elementos ---')
  else begin
    ImprimirVector (v, dimL);
    imprimirvectorrecursivo (v,diml);
  end;                  
  suma:= Sumar(v, dimL);
  writeln('La suma de los valores del vector es ', suma);
  maxim:=-9999; 
  obtenermaximo (v,diml,maxim);                                                         //maxim:= ObtenerMaximo(v, dimL);
  writeln('El maximo del vector es ', maxim); 
  writeln ('Ingrese un numero para chequear si esta en el vector');
  readln(valor);
  encontre:=false;
  vof (v,diml,valor,encontre);
  if encontre= true then
    writeln ('El valor se encuentra en el vector')
  else
    writeln ('El valor no se encuentra en el vector');
  descomponer (v,diml);
end.
