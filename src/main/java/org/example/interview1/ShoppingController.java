//package org.example.interview1;
//
//import lombok.AllArgsConstructor;
//
//@RestController
//@RequestMapping("/cart")
//public class ShoppingController {
//    private final CartService cartService;
//
//    public ShoppingController(CartService cartService) {
//        this.cartService = cartService;
//    }
//
//    @PostMapping("/add")
//    public ResponseEntity<Boolean> addItem(@RequestBody ItemDto itemDto){
//        return new ResponseEntity<>(cartService.add(itemDto), HttpStatus.CREATED);
//    }
//
//    @PutMapping("/remove")
//    public ResponseEntity<Boolean> removeItem(@RequestBody ItemDto itemDto){
//        return new ResponseEntity<>(cartService.remove(itemDto), HttpStatus.OK);
//    }
//
//    @DeleteMapping("/clear")
//    public ResponseEntity<Boolean> removeItem(){
//        return new ResponseEntity<>(cartService.clear(), HttpStatus.OK);
//    }
//
//}
