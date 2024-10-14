Program e3p4;

type
  producto = record
    codigo: integer;
    Uvendidas: integer;
    montototal: real;
  end;
  venta = record
    codigov: integer;
    codigop: integer;
    cant: integer;
    precio: real;
  end;
  arbol= ^nodo;
  nodo=record
    dato: producto;
    hi:arbol;
    hd:arbol;
  end;
{----------------------------------------------------}

procedure cargarventa (var v:venta);
begin 
  v.codigov:=random (20);
  if v.codigov<>0 then begin
    v.codigop:= random (20)+20;
    v.cant:=random (15)+1;
    v.precio:= random (100)+1;
  end;
end;

procedure cargarproducto (var p: producto; v: venta);
begin
  p.codigo:=v.codigop;
  p.uvendidas:=v.cant;
  p.montototal:=v.cant*v.precio;
end;
procedure agregarventa (var a: arbol; v: venta);
var
  p:producto;
begin
  if a=nil then begin
    new (a);
    cargarproducto (p,v);
    a^.dato:=p;
    a^.hi:=nil;
    a^.hd:=nil;
  end
  else
    if a^.dato.codigo=v.codigop then begin
      a^.dato.uvendidas:= a^.dato.uvendidas+v.cant;
      a^.dato.montototal:=a^.dato.montototal+(v.cant*v.precio);
    end
    else
      if v.codigop>=a^.dato.codigo then
        agregarventa(a^.hd,v)
      else
        agregarventa (a^.hi,v)
end;

procedure almacenarinfo (var a: arbol);
var
v: venta;
begin
  cargarventa (v);
  a:=nil;
  while v.codigov<>0 do begin
    agregarventa (a,v);
    cargarventa (v);
  end;
end;  

procedure imprimir (a:arbol);

begin
  if a<>nil then begin
    imprimir (a^.hi);
    writeln ('El producto con el codigo ',a^.dato.codigo,' vendio un total de ',a^.dato.uvendidas,' generando un monto total de: ',a^.dato.montototal:0:2);
    imprimir (a^.hd)
  end;
end;

procedure buscarcodigo (a: arbol; var codmax, unimax: integer);
begin
  if a<>nil then begin
    if a^.dato.uvendidas>unimax then begin
      codmax:=a^.dato.codigo;
      unimax:=a^.dato.uvendidas
    end;
    buscarcodigo (a^.hi,codmax,unimax);
    buscarcodigo (a^.hd,codmax,unimax);
  end;
end;

procedure codigomasventas (a: arbol);
var
  codmax,unimax: integer;
begin
  unimax:=0;
  buscarcodigo (a,codmax,unimax);
  writeln ('El codigo del producto con mas unidades vendidas es: ',codmax);
end;

procedure menorque2 (a:arbol; x: integer; var cant: integer);
begin
  if a<>nil then begin
    if a^.dato.codigo<x then begin
      cant:=cant+1;
      menorque2 (a^.hi,x,cant);
      menorque2 (a^.hd,x,cant);
    end
    else
      menorque2 (a^.hi,x,cant);
  end;
end;


procedure menorque (a:arbol);
var
  x, cant: integer;
begin
  cant:=0;
  writeln ('Ingrese  un valor para chequear cuantos productos con codigo menor a dicho a valor hay en el arbol');
  readln (x);
  menorque2 (a,x,cant);
  writeln ('Hay ',cant,' codigos que son menores a ',x);
end;

procedure montosupertotal2 (a: arbol; var montototal: real; min,max: integer);
begin
  if a<>nil then begin
    if (a^.dato.codigo<max) and (a^.dato.codigo>min) then begin
      montototal:=montototal+a^.dato.montototal;
      montosupertotal2 (a^.hi,montototal,min,max);
      montosupertotal2 (a^.hd,montototal,min,max);
    end
    else
      if a^.dato.codigo>=max then
        montosupertotal2 (a^.hi,montototal,min,max)
      else
        montosupertotal2 (a^.hd,montototal,min,max);
  end;
end;

procedure montosupertotal (a: arbol);
var
  montototal: real;
  min,max: integer;
begin 
  montototal:=0;
  writeln ('Ingrese el valor inferior del rango de los codigos de productos del los que quiere sumar el monto total');
  readln (min);
  writeln ('Ingrese el valor superior del rango de los codigos de productos del los que quiere sumar el monto total');
  readln (max);
  montosupertotal2 (a,montototal,min,max);
  writeln ('El monto total de las ventas de los producto con codigo dentro del rango de ',min,' y ',max,' es ',montototal:0:2);
end;
var
  a: arbol;
begin
  randomize;
  almacenarinfo (a);
  imprimir (a);
  codigomasventas (a);
  menorque (a);
  montosupertotal (a);
end.