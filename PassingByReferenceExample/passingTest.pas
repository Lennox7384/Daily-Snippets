program PassingByReference;

procedure ChangeValue(var x: integer); //Passing by reference
begin
  x := 20; 
  WriteLn('Value inside procedure: ', x);
end;

var
  num: integer = 10;

begin
  WriteLn('Value before procedure call: ', num);
  ChangeValue(num);
  WriteLn('Value after procedure call: ', num);
end.

