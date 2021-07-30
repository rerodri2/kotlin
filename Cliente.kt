class Cliente(val nome:String,
              val cpf:String,
              private val senha:Int
):Autenticavel{
     override fun autentica(senha: Int): Boolean {
         if (this.senha == senha){
             return this.senha == senha
         }else{
             return false
         }
     }



}