# Teoremi e Dimostrazioni orale Gemignani

### Teorema 2.2.1 - Errore inerente
Sia $x\in\R$ con $\omega\leq |x| \leq\Omega$ *(no **underflow/overflow**)*, si ha:
$$
\begin{align}
    |\epsilon_{in}| &= \left|\frac{trn(x)-x}{x}\right| & \leq u&=\beta^{1-t}\\
    &&&=\frac{1}{2}\beta^{1-t}\ \ \text{per}\ \ arr(x)
\end{align}
$$
#### Dimostrazione
Sia $x=(-1)^s\beta^p\alpha$. L'errore **assoluto** $|x-trn(x)|$ è maggiorato dalla distanza di due numeri di maccina **consecutivi**, per cui si ha
$$
\begin{align}
    |trn(x)-x|\leq\beta^{p-t} \tag{1}
\end{align}
$$
Inoltre vale $|x|\geq\beta^{p-1}$, quindi
$$
\begin{align}
    |\epsilon_{in}|=\left|\frac{trn(x)-x}{x}\right|&\leq\frac{\beta^{p-t}}{\beta^{p-1}}=\beta^{1-t}=u \tag{2}
\end{align}
$$
---
### Teorema 3.1.1 - Errore totale
$\epsilon_{tot}=\epsilon_{in}+\epsilon_{alg}$
#### Dimostrazione
$$
\begin{align*}
    \epsilon_{tot} &=\frac{g(\tilde{x}) - f(x)}{f(x)} \tag{1}\\ \\
    &=\underbrace{\frac{g(\tilde{x})-f(\tilde{x})}{f(\tilde{x})}}_{\epsilon_{alg}}\underbrace{\frac{f(\tilde{x})}{f(x)}}_{(1+\epsilon_x)}+\underbrace{\frac{f(\tilde{x})-f(x)}{f(x)}}_{\epsilon_{in}}\tag{2}\\ \\
    &=\epsilon_{alg}(1+\epsilon_x)+\epsilon_{in}\\
    &\doteq\epsilon_{alg}+\epsilon_{in}\tag{3}
\end{align*}
$$
---
### Teorema 4.4.1 - Cerchi di Gershgorin
Sia $A\in\mathbb{C}^{n\times n}$. Definiamo di **Cerchi di Gershgorin** $K_i\ \forall\ 1\leq i\leq n$ come
$$
\begin{align*}
    K_i = \left\{z\in\mathbb{C}: |z-a_{i,i}|\leq\sum_{j=1, J\neq i}^n|a_{i,j}|\ \ \forall\ 1\leq i\leq n\right\} \tag{1}
\end{align*}
$$
Allora

$\lambda$ autovalore di $A$ $\implies \lambda\in\bigcup_{i=1}^n K_i$

#### Dimostrazione

Sia $\lambda$ autovalore di $A$ con corrispondente autovettore **destro** $x$.\
La relazione $Ax=\lambda x$ implica
$$
\begin{align*}
    \sum_{j=1}^na_{i,j}x_j = \lambda x_i\ \ \forall\ 1\leq i\leq n\tag{1}
\end{align*}
$$
Estraendo dalla sommatoria l'elemento digonale rimane
$$
\begin{align*}
    \sum_{j=1,\ j\neq i}^na_{i,j}x_j + a_{i,i}x_i &= \lambda x_i&& \forall\ 1\leq i\leq n\tag{2.1}\\
    \sum_{j=1,\ j\neq i}^na_{i,j}x_j &= \lambda x_i - a_{i,i}x_i&& \forall\ 1\leq i\leq n\tag{2.2}\\
    \sum_{j=1,\ j\neq i}^na_{i,j}x_j &= (\lambda - a_{i,i})x_i&& \forall\ 1\leq i\leq n\tag{2.3}
\end{align*}
$$
Preso $p$ indice della componente di modulo massimo di $x$ (ES: $|x_p| = \|x\|_{\infty}$)\
Poichè $x=0\implies|x_p|>0$ e per $p=i$ otteniamo
$$
\begin{align*}
    \sum_{j=1,\ j\neq i}^na_{p,j}x_j &= (\lambda - a_{p,p})x_p \tag{3}\\
\end{align*}
$$
Passando ai valori assoluti
$$
\begin{align*}
    |(\lambda-a_{p,p})x_p| = |(\lambda-a_{p,p})||x_p| = \left|\sum_{j=1,\ j\neq i}^na_{p,j}x_j\right|\leq\sum_{j=1,\ j\neq i}^n|a_{p,j}||x_j|\tag{4}
\end{align*}
$$
Dividendo per $|x|$
$$
\begin{align*}
    |(\lambda-a_{p,p})|\leq\sum_{j=1,\ j\neq i}^n|a_{p,j}|\tag{5}
\end{align*}
$$
Da cui la tesi

---
### Teorema 5.1.1 - Esistenza e Unicità di LU
Data $A\in\R^{n\times n}$. Se $A(1:k, 1:k)$ e' invertibile $\forall\ 1\leq k\leq n-1$ allora esiste unica ($\exist!$) $LU$ di $A$ 
#### Dimostrazione
Per induzione su $n$
1. Per $n=1$ si ha $A=[a]=[1][a]$ unica fattoruzzazione $LU$ di $A$
2. Supponiamo la veridicita' del teorema per $A$ di ordine $m\leq n-1$
3. Costruiamo $LU$ per $A$ di ordine $n$

$$
\begin{align*}
\left[\begin{array}{c|c}
A(1:n-1,1:n-1) & z \\[0.5em]
\hline \\[-0.9em]
v^T & \alpha
\end{array}\right] = 
\left[\begin{array}{c|c}
L(1:n-1,1:n-1) & 0 \\[0.5em]
\hline \\[-0.9em]
\omega^T & 1
\end{array}\right] 
\left[\begin{array}{c|c}
U(1:n-1,1:n-1) & y \\[0.5em]
\hline \\[-0.9em]
0^T & \beta
\end{array}\right]
\end{align*}
$$
Come sistema
$$
\begin{cases}
    A(1:n-1,1:n-1) &= L(1:n-1,1:n-1)U(1:n-1,1:n-1) && (1)\\
    z &= A(1:n-1,1:n-1)y && (2)\\
    v^t &= \omega^TU(1:n-1,1:n-1) && (3)\\
    \alpha &= \omega^Ty+\beta && (4)\\
\end{cases}
$$

Per ipotesi $A(1:n-1,1:n-1)$ invertibile e per tale motivo $\exist!LU$ con fattori triangolari (equazione $(1)$ del sistema)
- $L(1:n-1,1:n-1)$ 
- $U(1:n-1,1:n-1)$ 

Sempre dall'invertibillita' di $A(1:n-1,1:n-1)$ segue che 
1. $L(1:n-1,1:n-1)$ e' invertibile per costruzione
2. $U(1:n-1,1:n-1)$ e' invertibile
    > $\det(A)=\det(LU)=\det(L)*\det(U)$ e poiche' $\det(L)=1$ per costruzione. Segue che $\det(A)=\det(U)$, se $\det(A)\neq 0\implies\det(U)\neq 0$

Di conseguenza le equazioni $(2)$ e $(3)$ del teorema ammetto unica soluzione. Anche l'equazione $(4)$ ammette unica soluzione poiche' conseguenza delle equazioni precedenti

---
### Teorema 6.1.2 - Convergenza dei Metodi Iterativi (Cond. Suff.)
Dato il metodo iterativo
$$
\begin{cases}
    x^{(0)}\in\R^n&&&&(1)\\
    x^{(k+1)}=Px^{(k)}+q&&k\geq 0&&(2)
\end{cases}
$$
> Con $P=M^{-1}N$, $\ q=M^{-1}b$, $\ A=M-N$

Il metodo converse se esiste ($\exist$) una norma matriciale indotta su $\R^n$ t.c. $\|P\|<1$

#### Dimostrazione
Prese le relazioni
$$
\begin{align*}
    x^{(k+1)}=Px^{(k)}+q&&&&x=Px+q
\end{align*}
$$
E sottratte tra di loro
$$
\begin{align*}
    \underbrace{x^{(k+1)}-x}_{e^{k+1}}&=\underbrace{P(x^{(k)}-x)}_{Pe^{k}}\\ \\
    e^{(k+1)}&=Pe^{(k)}\tag{2}
\end{align*}
$$
Stando alla relazione $(2)$ e' facile dimostrare che
$$
\begin{align*}
    e^{(k+1)}&=Pe^{(k)}\\
    &=P(Pe^{(k-1)})\\
    &=P(\underbrace{P*P*\dots*P}_{\text{k volte}}\ e^{(0)})\\
    &= P^{k+1}e^{(0)}
\end{align*}
$$
Passando alla norma
$$
\begin{align*}
    \|e^{(k+1)}\| = \|P^{k+1}e^{(0)}\|\leq \|P\|^{k+1}\|e^{(0)}\|
\end{align*}
$$

> Poiche' $\|P\|<1$ per ipotesi del teorema, $\lim_{k\to\infty}\|P\|^{k+1}\|e^{(0)}\|=0$ e per costruzione del teorema $0\leq \|e^{(k+1)}\|$

Segue dal teorema del confronto che $\forall e^{(0)}$ o, equivalentemente, $\forall x^{(0)}$
$$
\begin{align*}
    \lim_{k\to\infty}\|e^{(k+1)}\|=\lim_{k\to\infty}\|x^{(k+1)}-x\|=0
\end{align*}
$$

---
### Teorema 6.1.3 - Convergenza per Raggio Spettrale (Cond. Nec. e Suff.)
Dato il metodo iterativo
$$
\begin{cases}
    x^{(0)}\in\R^n&&&&(1)\\
    x^{(k+1)}=Px^{(k)}+q&&k\geq 0&&(2)
\end{cases}
$$
> Con $P=M^{-1}N$, $\ q=M^{-1}b$, $\ A=M-N$

Se $\rho(P)<1$ allora il metodo e' convergente
> Dove $\rho(A) = \max_i|\lambda_i|$ con $\lambda_1, \lambda_2, \dots, \lambda_n$ autovalori di $A$ e' detto **raggio spettrale di $A$**

---
### Teorema 6.3.1 - Convergenza di Jacobi e Gauss-Seidel

#### Dimostrazione


---
### Teorema 10.1.1 - Metodo di Bisezione

#### Dimostrazione


---
### Teorema 10.2.2 - Teorema del Punto Fisso

#### Dimostrazione


---
### Teorema 10.2.3 - Convergenza Locale dei Metodi di Iterazione Funzionale

#### Dimostrazione


---
### Teorema 10.3.1 - Convergenza Locale per Radici Semplici

#### Dimostrazione

