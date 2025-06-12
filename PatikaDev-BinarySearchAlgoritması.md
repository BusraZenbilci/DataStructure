# Binary Search Tree Projesi

Bu dosya [patika.dev](https://www.patika.dev/tr)'e ait olan ["Veri Yapıları ve Algoritmalar"](https://app.patika.dev/courses/veri-yapilari-ve-algoritmalar/) dersinin **Binary Search Tree** projesini içermektedir.

---

## 📌 Dizi
`[7, 5, 1, 8, 3, 6, 0, 9, 4, 2]`

---

## 🌳 Binary Search Tree Oluşumu

- Root **7**'dir.
- 5 < 7 → **5**, 7'nin soluna yerleşir.
- 1 < 7, 1 < 5 → **1**, 5'in soluna yerleşir.
- 8 > 7 → **8**, 7'nin sağına yerleşir.
- 3 < 7, 3 < 5, 3 > 1 → **3**, 1’in sağına yerleşir.
- 6 < 7, 6 > 5 → **6**, 5'in sağına yerleşir.
- 0 < 7, 0 < 5, 0 < 1 → **0**, 1'in soluna yerleşir.
- 9 > 7, 9 > 8 → **9**, 8'in sağına yerleşir.
- 4 < 7, 4 < 5, 4 > 1, 4 > 3 → **4**, 3'ün sağına yerleşir.
- 2 < 7, 2 < 5, 2 > 1, 2 < 3 → **2**, 3'ün soluna yerleşir.

---

## 🖼️ Final BST Yapısı

