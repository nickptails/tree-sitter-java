=======
decimal integer literal
=======

123;

---

(program (integer_literal (decimal_integer_literal)))

=============
hex_integer_literal
=============

0xa_bcd_ef0;

---

(program (integer_literal (hex_integer_literal)))

========
octal_integer_literal
========

0o123;
0O123;

---

(program (integer_literal (octal_integer_literal)) (integer_literal (octal_integer_literal)))

=======
binary_integer_literal
=======

0b001;
0B001;
0b10;
0B1000;

---

(program (integer_literal (binary_integer_literal)) (integer_literal (binary_integer_literal)) (integer_literal (binary_integer_literal)) (integer_literal (binary_integer_literal)))

======
decimal_floating_point_literal
======

4.23e9;
4.23e-9;
4.23e+9;
40.3e6;
40.3e-6;
1.234;
0.123456;
.12345;
1e4;
0.2e-2;
0.0e-4;
.2e-2;

---

(program (floating_point_literal (decimal_floating_point_literal)) (floating_point_literal (decimal_floating_point_literal)) (floating_point_literal (decimal_floating_point_literal)) (floating_point_literal (decimal_floating_point_literal)) (floating_point_literal (decimal_floating_point_literal)) (floating_point_literal (decimal_floating_point_literal)) (floating_point_literal (decimal_floating_point_literal)) (floating_point_literal (decimal_floating_point_literal)))

=====
hex_floating_point_literal
=====



---