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
    &=\underbrace{\frac{g(\tilde{x})-f(\tilde{x})}{f(\tilde{x})}}_{\epsilon_{alg}}\underbrace{\frac{f(\tilde{x})}{f(x)}}_{(1+\epsilon_x)}+\underbrace{\frac{f(\tilde{x}-f(x)}{f(x)}}_{\epsilon_{in}}\tag{2}\\ \\
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

#### Dimostrazione


---
### Teorema 6.1.2 - Convergenza dei Metodi Iterativi

#### Dimostrazione


---
### Teorema 6.1.3 - Convergenza per Raggio Spettrale


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

