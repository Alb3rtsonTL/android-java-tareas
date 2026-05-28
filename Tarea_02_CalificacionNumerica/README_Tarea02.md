# Tarea 02 — Calificación Numérica

**Asignatura:** Introducción al Desarrollo de Aplicaciones Móviles  
**Entrega:** Próxima clase

---

Estudiante: Albertson Terrero López

---

## Descripción de la app

Aplicación Android en Java que recibe una calificación numérica del 0 al 100 y muestra su equivalente en letra, con la información personalizada del estudiante en la interfaz.

### Escala de calificaciones

| Rango | Letra | Estado |
|-------|-------|--------|
| 90 – 100 | **A** | Excelente |
| 80 – 89 | **B** | Muy Bueno |
| 70 – 79 | **C** | Regular |
| 0 – 69 | **F** | Reprobado |

---

## Tecnologías

- **Lenguaje:** Java *(no Flutter, no React Native, no Xamarin)*
- **IDE:** Android Studio
- **SDK mínimo:** API 24 — Android 7.0
- **SDK objetivo:** API 36 — Android 16

---

## Estructura del proyecto

```
app/
└── src/main/
    ├── java/com/example/myapplication/
    │   └── MainActivity.java
    └── res/
        ├── layout/activity_main.xml
        └── drawable/
            ├── circulo_foto.xml
            ├── circulo_resultado.xml
            └── foto_estudiante.png
```

---

## Entregables

| Entregable | Enlace |
|---|---|
| 🎥 Video | [Ver en YouTube / Drive](https://link-aqui) |
| 📦 APK | [Descargar APK](https://link-aqui) |
| 📄 PDF entregado en aula | ✅ |

---

## Checklist de entrega

- [ ] App creada exclusivamente con Android Studio
- [ ] Recibe calificación numérica como entrada
- [ ] Muestra la letra equivalente (A, B, C o F)
- [ ] Nombre del estudiante visible en la interfaz
- [ ] Matrícula visible en la interfaz
- [ ] Foto del estudiante visible en la interfaz
- [ ] Video (obligatorio)
- [ ] PDF (una sola página)