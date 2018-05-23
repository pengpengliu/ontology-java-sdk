/*
 * Copyright (C) 2018 The ontology Authors
 * This file is part of The ontology library.
 *
 *  The ontology is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  The ontology is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with The ontology.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

/*
 * Copyright (C) 2018 The ontology Authors
 * This file is part of The ontology library.
 *
 *  The ontology is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  The ontology is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with The ontology.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package demo;

import com.github.ontio.common.Common;
import com.github.ontio.common.Helper;
import com.github.ontio.core.payload.DeployCode;
import com.github.ontio.core.transaction.Transaction;
import com.github.ontio.core.VmType;
import com.github.ontio.OntSdk;
import com.github.ontio.sdk.wallet.Identity;

import java.io.FileInputStream;
import java.io.InputStream;


/**
 *
 */
public class DeployCodeDemo {
    public static void main(String[] args) {
        try {
            OntSdk ontSdk = getOntSdk();

//            InputStream is = new FileInputStream("/Users/sss/dev/ontologytest/IdContract/IdContract.avm");//IdContract
//            byte[] bys = new byte[is.available()];
//            is.read(bys);
//            is.close();

            String password = "111111";
            Identity identity;
            if(ontSdk.getWalletMgr().getIdentitys().size() < 1){
                identity = ontSdk.getWalletMgr().createIdentity(password);
            }else{
                identity = ontSdk.getWalletMgr().getIdentitys().get(0);
            }
            String privatekey0 = "c19f16785b8f3543bbaf5e1dbb5d398dfa6c85aaad54fc9d71203ce83e505c07";
            com.github.ontio.account.Account acct0 = new com.github.ontio.account.Account(Helper.hexToBytes(privatekey0), ontSdk.signatureScheme);
            //code
            String code = "0115c56b6c766b00527ac46c766b51527ac4616c766b00c304696e6974876c766b54527ac46c766b54c36411006165af026c766b55527ac46278026c766b00c30a6d696e74546f6b656e73876c766b56527ac46c766b56c36411006165e6046c766b55527ac4624a026c766b00c30b746f74616c537570706c79876c766b57527ac46c766b57c3641100616513096c766b55527ac4621b026c766b00c3046e616d65876c766b58527ac46c766b58c3641100616506026c766b55527ac462f3016c766b00c30673796d626f6c876c766b59527ac46c766b59c36411006165ed016c766b55527ac462c9016c766b00c306656e6449636f876c766b5a527ac46c766b5ac36411006165f7066c766b55527ac4629f016c766b00c3087472616e73666572876c766b5b527ac46c766b5bc3647100616c766b51c3c0539c009c6c766b5f527ac46c766b5fc3640e00006c766b55527ac4625c016c766b51c300c36c766b5c527ac46c766b51c351c36c766b5d527ac46c766b51c352c36c766b5e527ac46c766b5cc36c766b5dc36c766b5ec3615272655a086c766b55527ac46213016c766b00c30962616c616e63654f66876c766b60527ac46c766b60c3644d00616c766b51c3c0519c009c6c766b0112527ac46c766b0112c3640e00006c766b55527ac462cd006c766b51c300c36c766b0111527ac46c766b0111c36165360a6c766b55527ac462aa006c766b00c308646563696d616c73876c766b0113527ac46c766b0113c36411006165ab006c766b55527ac4627c006165870d6c766b52527ac46165fc0e6c766b53527ac46c766b53c300907c907ca1630e006c766b52c3c000a0620400006c766b0114527ac46c766b0114c364300061616c766b52c36c766b53c3617c06726566756e6453c168124e656f2e52756e74696d652e4e6f746966796161006c766b55527ac46203006c766b55c3616c756600c56b0943505820546f6b656e616c756600c56b03435058616c756600c56b58616c756653c56b616168164e656f2e53746f726167652e476574436f6e746578740b746f74616c537570706c79617c680f4e656f2e53746f726167652e4765746c766b00527ac46c766b00c3c000a06c766b51527ac46c766b51c3640e00006c766b52527ac462fa016168164e656f2e53746f726167652e476574436f6e746578746114b30f23279d728063e8b7414bc641a20ef56c6d05070000e6f4573466615272680f4e656f2e53746f726167652e5075746161006114b30f23279d728063e8b7414bc641a20ef56c6d05070000e6f4573466615272087472616e7366657254c168124e656f2e52756e74696d652e4e6f74696679616168164e656f2e53746f726167652e476574436f6e746578746114b30f23279d728063e8b7414bc641a20ef56c6d050700c06cc92ade0f615272680f4e656f2e53746f726167652e5075746161006114b30f23279d728063e8b7414bc641a20ef56c6d050700c06cc92ade0f615272087472616e7366657254c168124e656f2e52756e74696d652e4e6f74696679616168164e656f2e53746f726167652e476574436f6e7465787461140100aeb10ff2919bfe14dc432899d3b6498931190700a2333d4f3b6c615272680f4e656f2e53746f726167652e50757461610061140100aeb10ff2919bfe14dc432899d3b6498931190700a2333d4f3b6c615272087472616e7366657254c168124e656f2e52756e74696d652e4e6f74696679616168164e656f2e53746f726167652e476574436f6e746578740b746f74616c537570706c7904a2aef725615272680f4e656f2e53746f726167652e50757461516c766b52527ac46203006c766b52c3616c75665ec56b616165780a6c766b00527ac46c766b00c3c0009c6c766b59527ac46c766b59c3640f0061006c766b5a527ac46284026168184e656f2e426c6f636b636861696e2e4765744865696768746168184e656f2e426c6f636b636861696e2e4765744865616465726168174e656f2e4865616465722e47657454696d657374616d706c766b51527ac46c766b51c304d0396e5a946c766b52527ac46165610b6c766b53527ac46c766b00c36c766b53c36c766b52c361527265710e6c766b54527ac46c766b54c3009c6c766b5b527ac46c766b5bc3640f0061006c766b5a527ac462d2016c766b52c36165ab066c766b55527ac46c766b55c3009c6c766b5c527ac46c766b5cc3643a0061616c766b00c36c766b54c3617c06726566756e6453c168124e656f2e52756e74696d652e4e6f7469667961006c766b5a527ac46275016c766b00c36c766b54c36c766b55c3615272659a066c766b56527ac46c766b56c3009c6c766b5d527ac46c766b5dc3640f0061006c766b5a527ac46237016168164e656f2e53746f726167652e476574436f6e746578746c766b00c3617c680f4e656f2e53746f726167652e4765746c766b57527ac46168164e656f2e53746f726167652e476574436f6e746578746c766b00c36c766b56c36c766b57c393615272680f4e656f2e53746f726167652e507574616168164e656f2e53746f726167652e476574436f6e746578740b746f74616c537570706c79617c680f4e656f2e53746f726167652e4765746c766b58527ac46168164e656f2e53746f726167652e476574436f6e746578740b746f74616c537570706c796c766b56c36c766b58c393615272680f4e656f2e53746f726167652e5075746161006c766b00c36c766b56c3615272087472616e7366657254c168124e656f2e52756e74696d652e4e6f7469667961516c766b5a527ac46203006c766b5ac3616c756655c56b616114f9a28e064678c6ad2d90f7b1d6886d3a6fa34f896168184e656f2e52756e74696d652e436865636b5769746e657373009c6c766b52527ac46c766b52c3640e00006c766b53527ac46249016168164e656f2e53746f726167652e476574436f6e746578740b746f74616c537570706c79617c680f4e656f2e53746f726167652e4765746c766b00527ac404a2085a286c766b00c3946c766b51527ac46c766b51c300a16c766b54527ac46c766b54c3640f0061006c766b53527ac462d6006168164e656f2e53746f726167652e476574436f6e746578740b746f74616c537570706c7904a2085a28615272680f4e656f2e53746f726167652e507574616168164e656f2e53746f726167652e476574436f6e746578746114f9a28e064678c6ad2d90f7b1d6886d3a6fa34f896c766b51c3615272680f4e656f2e53746f726167652e5075746161006114f9a28e064678c6ad2d90f7b1d6886d3a6fa34f896c766b51c3615272087472616e7366657254c168124e656f2e52756e74696d652e4e6f7469667961516c766b53527ac46203006c766b53c3616c756651c56b616168164e656f2e53746f726167652e476574436f6e746578740b746f74616c537570706c79617c680f4e656f2e53746f726167652e4765746c766b00527ac46203006c766b00c3616c75665bc56b6c766b00527ac46c766b51527ac46c766b52527ac4616c766b52c300a16c766b55527ac46c766b55c3640e00006c766b56527ac46205026c766b00c36168184e656f2e52756e74696d652e436865636b5769746e657373009c6c766b57527ac46c766b57c3640e00006c766b56527ac462c9016c766b00c36c766b51c39c6c766b58527ac46c766b58c3640e00516c766b56527ac462a4016168164e656f2e53746f726167652e476574436f6e746578746c766b00c3617c680f4e656f2e53746f726167652e4765746c766b53527ac46c766b53c36c766b52c39f6c766b59527ac46c766b59c3640e00006c766b56527ac46247016c766b53c36c766b52c39c6c766b5a527ac46c766b5ac3643b006168164e656f2e53746f726167652e476574436f6e746578746c766b00c3617c68124e656f2e53746f726167652e44656c657465616241006168164e656f2e53746f726167652e476574436f6e746578746c766b00c36c766b53c36c766b52c394615272680f4e656f2e53746f726167652e507574616168164e656f2e53746f726167652e476574436f6e746578746c766b51c3617c680f4e656f2e53746f726167652e4765746c766b54527ac46168164e656f2e53746f726167652e476574436f6e746578746c766b51c36c766b54c36c766b52c393615272680f4e656f2e53746f726167652e50757461616c766b00c36c766b51c36c766b52c3615272087472616e7366657254c168124e656f2e52756e74696d652e4e6f7469667961516c766b56527ac46203006c766b56c3616c756652c56b6c766b00527ac4616168164e656f2e53746f726167652e476574436f6e746578746c766b00c3617c680f4e656f2e53746f726167652e4765746c766b51527ac46203006c766b51c3616c756652c56b616168164e656f2e53746f726167652e476574436f6e746578740669636f4e656f617c680f4e656f2e53746f726167652e4765746c766b00527ac46c766b00c36c766b51527ac46203006c766b51c3616c756653c56b6c766b00527ac4616c766b00c3009f6310006c766b00c303008d27a0620400516c766b51527ac46c766b51c3640f0061006c766b52527ac4621400610500e87648176c766b52527ac46203006c766b52c3616c75665ec56b6c766b00527ac46c766b51527ac46c766b52527ac4616c766b51c30400e1f505966c766b52c3956c766b53527ac46168164e656f2e53746f726167652e476574436f6e746578740b746f74616c537570706c79617c680f4e656f2e53746f726167652e4765746c766b54527ac46168164e656f2e53746f726167652e476574436f6e746578740669636f4e656f617c680f4e656f2e53746f726167652e4765746c766b55527ac404a2085a286c766b54c3946c766b56527ac46c766b56c300a16c766b57527ac46c766b57c3643a0061616c766b00c36c766b51c3617c06726566756e6453c168124e656f2e52756e74696d652e4e6f7469667961006c766b58527ac46281016c766b56c36c766b53c39f6c766b59527ac46c766b59c3640c01616c766b56c36c766b5a527ac46c766b5ac36c766b52c3966c766b5b527ac46c766b51c36c766b5bc30400e1f50595946c766b5c527ac4616c766b00c36c766b5cc3617c06726566756e6453c168124e656f2e52756e74696d652e4e6f74696679616168164e656f2e53746f726167652e476574436f6e746578740b746f74616c537570706c79617c680f4e656f2e53746f726167652e4765746c766b5d527ac46168164e656f2e53746f726167652e476574436f6e746578740b746f74616c537570706c796c766b5dc36c766b5ac393615272680f4e656f2e53746f726167652e507574616c766b5bc30400e1f505956a51527ac46c766b5bc36c766b52c3956c766b53527ac4616c766b55c36c766b51c3936c766b55527ac46168164e656f2e53746f726167652e476574436f6e746578740669636f4e656f6c766b55c3615272680f4e656f2e53746f726167652e507574616c766b53c36c766b58527ac46203006c766b58c3616c756657c56b6161682953797374656d2e457865637574696f6e456e67696e652e476574536372697074436f6e7461696e65726c766b00527ac46c766b00c361681d4e656f2e5472616e73616374696f6e2e4765745265666572656e6365736c766b51527ac4616c766b51c36c766b52527ac4006c766b53527ac4629e006c766b52c36c766b53c3c36c766b54527ac4616c766b54c36168154e656f2e4f75747075742e4765744173736574496461209b7cffdaa674beae0f930ebe6085af9093e5fe56b34a5c220ccdcf6efc336fc59c6c766b55527ac46c766b55c3642d006c766b54c36168184e656f2e4f75747075742e476574536372697074486173686c766b56527ac4622c00616c766b53c351936c766b53527ac46c766b53c36c766b52c3c09f6359ff006c766b56527ac46203006c766b56c3616c756651c56b6161682d53797374656d2e457865637574696f6e456e67696e652e476574457865637574696e67536372697074486173686c766b00527ac46203006c766b00c3616c756658c56b6161682953797374656d2e457865637574696f6e456e67696e652e476574536372697074436f6e7461696e65726c766b00527ac46c766b00c361681a4e656f2e5472616e73616374696f6e2e4765744f7574707574736c766b51527ac4006c766b52527ac4616c766b51c36c766b53527ac4006c766b54527ac462ce006c766b53c36c766b54c3c36c766b55527ac4616c766b55c36168184e656f2e4f75747075742e47657453637269707448617368616505ff907c907c9e6346006c766b55c36168154e656f2e4f75747075742e4765744173736574496461209b7cffdaa674beae0f930ebe6085af9093e5fe56b34a5c220ccdcf6efc336fc59c620400006c766b56527ac46c766b56c3642d00616c766b52c36c766b55c36168134e656f2e4f75747075742e47657456616c7565936c766b52527ac461616c766b54c351936c766b54527ac46c766b54c36c766b53c3c09f6329ff6c766b52c36c766b57527ac46203006c766b57c3616c756659c56b6c766b00527ac46c766b51527ac46c766b52527ac46c766b53527ac4616168164e656f2e53746f726167652e476574436f6e746578746c766b00c36c766b53c37e617c680f4e656f2e53746f726167652e4765746c766b54527ac46c766b52c36c766b54c3946c766b55527ac46c766b55c300a0009c6c766b56527ac46c766b56c3643a0061616c766b00c36c766b51c3617c06726566756e6453c168124e656f2e52756e74696d652e4e6f7469667961006c766b57527ac462f5006c766b55c36c766b51c39f6c766b58527ac46c766b58c364880061616c766b00c36c766b51c36c766b55c394617c06726566756e6453c168124e656f2e52756e74696d652e4e6f74696679616168164e656f2e53746f726167652e476574436f6e746578746c766b00c36c766b53c37e6c766b55c36c766b54c393615272680f4e656f2e53746f726167652e507574616c766b55c36c766b57527ac46256006168164e656f2e53746f726167652e476574436f6e746578746c766b00c36c766b53c37e6c766b51c36c766b54c393615272680f4e656f2e53746f726167652e507574616c766b51c36c766b57527ac46203006c766b57c3616c756658c56b6c766b00527ac46c766b51527ac46c766b52527ac4616c766b52c3009f6c766b53527ac46c766b53c3643a0061616c766b00c36c766b51c3617c06726566756e6453c168124e656f2e52756e74696d652e4e6f7469667961006c766b54527ac46231016c766b52c302100ea0009c6c766b55527ac46c766b55c3643b00616c766b00c36c766b51c3040084d717056361705f31615379517955727551727552795279547275527275659bfd6c766b54527ac462df006c766b52c302201ca0009c6c766b56527ac46c766b56c3643b00616c766b00c36c766b51c30400ca9a3b056361705f326153795179557275517275527952795472755272756549fd6c766b54527ac4628d006c766b52c302302aa0009c6c766b57527ac46c766b57c3643c00616c766b00c36c766b51c305005ed0b200056361705f3361537951795572755172755279527954727552727565f6fc6c766b54527ac4623a0061616c766b00c36c766b51c3617c06726566756e6453c168124e656f2e52756e74696d652e4e6f7469667961006c766b54527ac46203006c766b54c3616c7566";
            //code = Helper.toHexString(bys);
//            System.out.println("Code:" + Helper.toHexString(bys));
            System.out.println("CodeAddress:" + Helper.getCodeAddress(code, VmType.NEOVM.value()));

            ontSdk.vm().setCodeAddress(Helper.getCodeAddress(code, VmType.NEOVM.value()));

            Transaction tx = ontSdk.vm().makeDeployCodeTransaction(code, true, "name", "1.0", "1", "1", "1", VmType.NEOVM.value(),identity.ontid,0);
            ontSdk.signTx(tx,identity.ontid.replace(Common.didont,""),password);
            String txHex = Helper.toHexString(tx.toArray());
            System.out.println(txHex);
            ontSdk.getConnectMgr().sendRawTransaction(txHex);

            System.out.println("txhash:" + tx.hash().toString());
            Thread.sleep(6000);
            String txhash = tx.hash().toHexStringReverse();
            DeployCode t = (DeployCode) ontSdk.getConnectMgr().getTransaction(txhash);
            System.out.println(t.txType.value() & 0xff);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static OntSdk getOntSdk() throws Exception {
        String ip = "http://127.0.0.1";
//        String ip = "http://54.222.182.88;
//        String ip = "http://139.219.108.204";
        String restUrl = ip + ":" + "20334";
        String rpcUrl = ip + ":" + "20386";
        String wsUrl = ip + ":" + "20385";

        OntSdk wm = OntSdk.getInstance();
        wm.setRpc(rpcUrl);
        wm.setRestful(restUrl);
        wm.setDefaultConnect(wm.getRestful());

        wm.openWalletFile("DeployDemo.json");

        return wm;
    }
}
