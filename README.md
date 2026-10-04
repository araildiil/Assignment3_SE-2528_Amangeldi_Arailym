# Assignment 3 | Bridge Pattern

- Name: Amangeldi Arailym
- Group: SE-2528
- Topic: A (Drawing)
- Repository: https://github.com/araildiil/Assignment3_SE-2528_Amangeldi_Arailym.git
- Base commit: b870a537efe8b3846b39f9adc0fe34954ca7e369
- Submitted commit: 74a64f94565ce9f173fae3d96103ec3d08fd37af

## Role map

| Role | Class | Path |
|---|---|---|
| Abstraction | Shape | src/Shape.java |
| A1 | Circle | src/Circle.java |
| A2 | Square | src/Square.java |
| Implementor | Renderer | src/Renderer.java |
| I1 | VectorRenderer | src/VectorRenderer.java |
| I2 | RasterRenderer | src/RasterRenderer.java |
| I3 | AsciiRenderer | src/AsciiRenderer.java |
| Client | Main | src/Main.java |

## Where to look

- Bridge field: `Shape.renderer` (`src/Shape.java`)
- execute(): declared abstract in `Shape`; implemented in `Circle.execute()` and `Square.execute()`
- setImplementation(...): `Shape.setImplementation(Renderer)` (`src/Shape.java`)
- T5 check: `Main.demo()` — reference equality via `==`, unchanged `id`/`dimension`

## Build and run
javac --release 17 -encoding UTF-8 -d out @sources.txt
java -cp out Main --demo

text

## Expected results

| Check | Expected result |
|---|---|
| T1 | VECTOR circle radius=2 |
| T2 | RASTER circle radius=2px |
| T3 | VECTOR square side=3 |
| T4 | RASTER square side=3px |
| T5 | sameObject=true, stateUnchanged=true, before=VECTOR circle radius=2, after=RASTER circle radius=2px |
| T6 | ASCII (circle r=2) |
| T7 | ASCII [square s=3] |
| Summary | SUMMARY: 7/7 PASS |