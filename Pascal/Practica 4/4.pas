Program ej4p4;

type
  dias = 1..31;
  meses = 1..12;
  prestamo = record
    isbn: integer;
    numero: integer;
    dia: dias;
    mes: meses;
    cantidad: integer;
  end;
  
  arbol1= ^nodo1;
  
  nodo1 = record
    dato: prestamo;
    hi: arbol1;
    hd: arbol1;
  end;
  
  elemento = record
    numero: integer;
    dia: dias;
    mes: meses;
    cantidad: integer;
  end;
  
  lista=^nodo;
  
  nodo= record
    elem:elemento;
    sig:lista;
  end;
  
  arbol2=^nodo2;
  
  nodo2= record
    isbn: integer;
    dato:lista;
    hi:arbol2;
    hd:arbol2;
  end;
   
  arbol3=^nodo3;
  
  nodo3=record
    isbn: integer;
    cant: integer;
    hi: arbol3;
    hd: arbol3;
  end;
  
procedure armarprestamo (var p:prestamo);
begin
  p.isbn:= random (11);
  if p.isbn<>0 then begin
    p.numero:= random (11)+11;
    p.dia:= random (31)+1;
    p.mes:= random (12)+1;
    p.cantidad:= random (22)+1;
  end;
end;

procedure agregararbol1 (var a: arbol1; p: prestamo);

begin
  if a=nil then begin
    new (a);
    a^.dato:=p;
    a^.hi:=nil;
    a^.hd:=nil;
  end
  else
    if p.isbn>=a^.dato.isbn then
      agregararbol1 (a^.hd,p)
    else
      agregararbol1 (a^.hi,p);
end;

procedure transformar (p: prestamo; var e: elemento);
begin
  e.numero:=p.numero;
  e.dia:=p.dia;
  e.mes:=p.mes;
  e.cantidad:=p.cantidad;
end;

procedure agregar (var l: lista; e: elemento);
var
aux: lista;
begin
  new (aux);
  aux^.elem:=e;
  aux^.sig:=l;
  l:=aux;
end;
procedure armararbol2 (var a2:arbol2; p:prestamo);
var
  e: elemento; 
begin
  if a2=nil then begin
    new (a2);
    a2^.isbn:=p.isbn;
    transformar (p,e);
    a2^.dato:=nil;
    agregar (a2^.dato,e);
    a2^.hi:=nil;
    a2^.hd:=nil;
  end
  else
    if a2^.isbn=p.isbn then begin
      transformar (p,e);
      agregar (a2^.dato,e);
    end
    else
      if p.isbn>a2^.isbn then
        armararbol2 (a2^.hd,p)
      else
        armararbol2 (a2^.hi,p);
end;


procedure armararbol (var a: arbol1; var a2: arbol2);
var
  p:prestamo;
begin
  a:=nil;
  a2:=nil;
  armarprestamo (p);
  while p.isbn <>0 do begin
    agregararbol1 (a,p);
    armararbol2 (a2,p);
    armarprestamo (p);
  end;
end;

procedure puntob2 (a: arbol1; var max: integer);
begin
  if a<>nil then begin
    puntob2 (a^.hd,max);
    if a^.hd=nil then
      max:=a^.dato.isbn
  end;
end;
procedure puntob (a: arbol1);
var
  max: integer;
begin
  max:=-1;
  puntob2 (a,max) ;
  writeln ('El isbn mas grande es ',max);
end;
procedure imprimir (a:arbol1);
begin
  if a<>nil then begin
    imprimir (a^.hi);
    writeln ('El ISBN es: ',a^.dato.isbn);
    writeln ('El numero de socio es: ',a^.dato.numero);
    writeln ('---------------------------------');
    imprimir (a^.hd);
  end;
end;

procedure puntoc2 (a2: arbol2; var min: integer);
begin
  if a2<>nil then begin
    if a2^.isbn<min then begin
      min:=a2^.isbn;
    end;
    puntoc2 (a2^.hi,min);
  end;
end;
procedure puntoc (a2: arbol2);
var
  min: integer;
begin
  min:=9999;
  puntoc2 (a2,min);
  writeln ('El isbn mas chico es: ',min);
end;

procedure puntod2 (a:arbol1; var cant: integer; num:integer);
begin
  if a<>nil then begin
    if a^.dato.numero=num then
      cant:=cant+1;
    puntod2 (a^.hi,cant,num);
    puntod2 (a^.hd,cant,num);
  end;
end;
procedure puntod (a:arbol1);
var
  num,cant: integer;
begin
  cant:=0;
  writeln ('Ingrese el numero de socio para chequear cuantos prestamos realizados tiene');
  readln (num);
  puntod2 (a,cant,num);
  writeln ('El socio ',num,' tiene ',cant,' prestamos realizados');
end;

procedure recorrerlista (l: lista; num: integer; var cant: integer);
begin
  while l<>nil do begin
    if l^.elem.numero=num then
      cant:=cant+1;
    l:=l^.sig;
  end;
end;
procedure puntoe2 (a: arbol2; num: integer; var cant: integer);
begin
  if a<>nil then begin
    recorrerlista (a^.dato,num,cant);
    puntoe2 (a^.hi,num,cant);
    puntoe2 (a^.hd,num,cant);
  end;
end;

procedure puntoe (a2:arbol2);
var
  num, cant:integer;
begin
  cant:=0;
  writeln ('PUNTO E-----------Ingrese el numero de socio para chequear cuantos prestamos realizados tiene');
  readln (num);
  puntoe2 (a2,num,cant);
  writeln ('PUNTO E-----------El socio ',num,' tiene ',cant,' prestamos realizados');
end;

procedure puntof2 (var a3: arbol3; ISBN: integer);
begin
  if a3=nil then begin
    new (a3);
    a3^.isbn:=isbn;
    a3^.cant:=1;
    a3^.hi:=nil;
    a3^.hd:=nil;
  end
  else begin
    if isbn=a3^.isbn then begin
      a3^.cant:=a3^.cant+1;
    end
    else
      if isbn>a3^.isbn then begin
        puntof2 (a3^.hd,isbn);
      end
      else 
        puntof2 (a3^.hi,isbn);
  end;
end;

procedure puntof (a:arbol1; var a3: arbol3); 
begin
  if a <> nil then begin
    puntof2 (a3,a^.dato.isbn);
    puntof (a^.hi,a3);
    puntof (a^.hd,a3);
  end;
end;

procedure imprimirpuntof (a3: arbol3);
begin
  if a3<>nil then begin
    imprimirpuntof (a3^.hi);
    writeln ('El ISBN ',a3^.isbn,' se presto ',a3^.cant,' veces');
    imprimirpuntof (a3^.hd);
  end;
end;

procedure calcularcant (var cant: integer; l: lista);
begin
  while l<>nil do begin
    cant:=cant+1;
    l:=l^.sig;
  end;
end;
procedure puntog2 (a2:arbol2; var a3: arbol3);

begin
  if a3=nil then begin
    new (a3);
    a3^.isbn:=a2^.isbn;
    a3^.cant:=0;
    calcularcant (a3^.cant,a2^.dato);
    a3^.hi:=nil;
    a3^.hd:=nil;
  end
  else begin
    if a2^.isbn>a3^.isbn then
      puntog2 (a2,a3^.hd)
    else
      puntog2 (a2,a3^.hi);
  end;
end;

procedure puntog (a:arbol2; var a3:arbol3);
begin
  if a<>nil then begin
    puntog2 (a,a3);
    puntog (a^.hi,a3);
    puntog (a^.hd,a3);
  end;
end;

procedure puntoi2 (a:arbol1; min,max: integer; var cant:integer);
begin
  if a<> nil then begin
    if (a^.dato.isbn>=min) and (a^.dato.isbn<=max) then begin
      cant:= cant+1;
      puntoi2 (a^.hi,min,max,cant);
      puntoi2 (a^.hd,min,max,cant);
    end
    else begin
      if a^.dato.isbn<min then
        puntoi2 (a^.hd,min,max,cant)
      else 
        puntoi2 (a^.hi,min,max,cant);
    end;
  end;
end;
  
procedure puntoi (a: arbol1);
var
  min,max,cant: integer;  
begin
  cant:=0;
  writeln ('Ingrese el valor inferior del rango del que quiere chequear la cantidad de prestamos de los ISBNs');
  readln (min);
  writeln ('Ingrese el valor inferior del rango del que quiere chequear la cantidad de prestamos de los ISBNs');
  readln (max);
  puntoi2 (a,min,max,cant);
  writeln ('La cantidad de prestamos que se hicieron de los ISBN del rango ingresado es ',cant);
end;

procedure puntoj2 (a2: arbol2;min,max: integer; var cant: integer);
begin
  if a2<>nil then begin
    if (a2^.isbn>=min) and (a2^.isbn<=max) then begin 
      calcularcant (cant, a2^.dato);
      puntoj2 (a2^.hi,min,max,cant);
      puntoj2 (a2^.hd,min,max,cant);
    end
    else begin
      if a2^.isbn<min then
        puntoj2 (a2^.hd,min,max,cant)
      else
        puntoj2 (a2^.hi,min,max,cant);
    end;
  end;
end;
procedure puntoj (a2: arbol2);
var
  min,max,cant: integer;
begin
  cant:=0;
  writeln ('PUNTO J Ingrese el valor inferior del rango del que quiere chequear la cantidad de prestamos de los ISBNs');
  readln (min);
  writeln ('Ingrese el valor inferior del rango del que quiere chequear la cantidad de prestamos de los ISBNs');
  readln (max);
  puntoj2 (a2,min,max,cant);
  writeln ('La cantidad de prestamos que se hicieron de los ISBN del rango ingresado es ',cant);
end;

var
  a: arbol1;
  a2:arbol2;
  a3,a32:arbol3;
begin
  randomize;
  armararbol (a,a2); 
  imprimir (a);
  puntob (a);
  puntoc (a2);
  puntod (a);
  puntoe (a2);
  a3:=nil;
  puntof (a,a3);
  imprimirpuntof (a3);
  a32:=nil;
  puntog (a2,a32);
  writeln ('-----------------PUNTO G----------------');
  imprimirpuntof (a32); //punto H
  puntoi (a);
  puntoj (a2)
end.
