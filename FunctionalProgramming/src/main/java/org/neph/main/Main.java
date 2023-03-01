package org.neph.main;

import javax.sql.rowset.serial.SerialBlob;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ Author NMuchiri
 **/
public class Main {
    public static void main(String[] args) {

        List<String> corporateRequests = Stream.of(
                "{\"corporateCreditInformationRecord\":{\"accountNumber\":\"LD1903903710\",\"accountOwner\":\"P\",\"accountRepaymentTerm\":\"IRR\",\"accountStatus\":\"C\",\"accountType\":\"R\",\"actualPaymentAmount\":\"0\",\"amountPastDue\":\"0\",\"approvalDate\":\"20190208\",\"availableCredit\":\"0\",\"category\":\"39\",\"classification\":\"1\",\"companyCeaseDate\":\"\",\"companyRegNo\":\"103550848\",\"companyRegistrationDate\":\"20150205\",\"country\":\"RW\",\"currencyType\":\"RWF\",\"currentBalance\":\"10000\",\"currentBalanceIndicator\":\"D\",\"dateAccountOpened\":\"20190208\",\"dateAccountUpdated\":\"20190208\",\"dateClosed\":\"20190620\",\"daysInArrears\":\"0\",\"emailAddress\":\"\",\"facsimile1\":\"\",\"facsimile2\":\"\",\"finalPaymentDate\":\"20210809\",\"firstPaymentDate\":\"20190620\",\"industry\":\"\",\"installmentsInArrears\":\"0\",\"institution\":\"IDAHO HARDWARE SUPPLY LTD\",\"interestRateAtDisbursement\":\"18\",\"lastPaymentDate\":\"20190520\",\"nature\":\"24\",\"numberOfJointLoanParticipants\":\"\",\"openingBalance\":\"300000000\",\"passportNumber\":null,\"physicalAddressCell\":\"CYUGARO\",\"physicalAddressDistrict\":\"NTARAMA\",\"physicalAddressLine1\":\"BUGESERA NTARAMA\",\"physicalAddressLine2\":\"\",\"physicalAddressPlotNumber\":\"\",\"physicalAddressPostalCode\":\"\",\"physicalAddressProvince\":\"IBURASIRAZUBA\",\"physicalAddressSector\":\"NTARAMA\",\"postalAddressNumber\":\"\",\"postalCode\":\"\",\"scheduledPaymentAmount\":\"100\",\"sectorOfActivity\":\"PUBLIC WORKS AND BUILDING\",\"surName\":\"\",\"taxNo\":\"103550848\",\"telephone1\":\"250788806714\",\"telephone2\":\"\",\"telephone3\":\"\",\"telephone4\":\"\",\"telephone5\":\"\",\"telephone6\":\"\",\"termsDuration\":\"30\",\"tradingName\":\"IDAHO HARDWARE SUPPLY LTD\",\"vatNo\":\"103550848\"},\"recordType\":\"CI\"}",
                "{\"corporateCreditInformationRecord\":{\"accountNumber\":\"LD1903903710\",\"accountOwner\":\"P\",\"accountRepaymentTerm\":\"IRR\",\"accountStatus\":\"C\",\"accountType\":\"R\",\"actualPaymentAmount\":\"0\",\"amountPastDue\":\"0\",\"approvalDate\":\"20190208\",\"availableCredit\":\"0\",\"category\":\"39\",\"classification\":\"1\",\"companyCeaseDate\":\"\",\"companyRegNo\":\"103550848\",\"companyRegistrationDate\":\"20150205\",\"country\":\"RW\",\"currencyType\":\"RWF\",\"currentBalance\":\"10000\",\"currentBalanceIndicator\":\"D\",\"dateAccountOpened\":\"20190208\",\"dateAccountUpdated\":\"20190208\",\"dateClosed\":\"20190620\",\"daysInArrears\":\"0\",\"emailAddress\":\"\",\"facsimile1\":\"\",\"facsimile2\":\"\",\"finalPaymentDate\":\"20210809\",\"firstPaymentDate\":\"20190620\",\"industry\":\"\",\"installmentsInArrears\":\"0\",\"institution\":\"IDAHO HARDWARE SUPPLY LTD\",\"interestRateAtDisbursement\":\"18\",\"lastPaymentDate\":\"20190520\",\"nature\":\"24\",\"numberOfJointLoanParticipants\":\"\",\"openingBalance\":\"300000000\",\"passportNumber\":null,\"physicalAddressCell\":\"CYUGARO\",\"physicalAddressDistrict\":\"NTARAMA\",\"physicalAddressLine1\":\"BUGESERA NTARAMA\",\"physicalAddressLine2\":\"\",\"physicalAddressPlotNumber\":\"\",\"physicalAddressPostalCode\":\"\",\"physicalAddressProvince\":\"IBURASIRAZUBA\",\"physicalAddressSector\":\"NTARAMA\",\"postalAddressNumber\":\"\",\"postalCode\":\"\",\"scheduledPaymentAmount\":\"100\",\"sectorOfActivity\":\"PUBLIC WORKS AND BUILDING\",\"surName\":\"\",\"taxNo\":\"103550848\",\"telephone1\":\"250788806714\",\"telephone2\":\"\",\"telephone3\":\"\",\"telephone4\":\"\",\"telephone5\":\"\",\"telephone6\":\"\",\"termsDuration\":\"30\",\"tradingName\":\"IDAHO HARDWARE SUPPLY LTD\",\"vatNo\":\"103550848\"},\"recordType\":\"CI\"}",
                "{\"corporateCreditInformationRecord\":{\"currencyType\":\"USD\",\"country\":\"RW\",\"dateAccountUpdated\":\"20221201\",\"postalCode\":\"3109 KIGALI\",\"telephone3\":\"0788568749\",\"telephone2\":\"0788568749\",\"telephone1\":\"0788568749\",\"physicalAddressPlotNumber\":\"\",\"facsimile1\":\"\",\"facsimile2\":\"\",\"institution\":\"FAIR CONSTRUCTION LTD\",\"emailAddress\":\"fair@fairconstructionrw.com\",\"telephone6\":\"0788568749\",\"telephone5\":\"0788568749\",\"telephone4\":\"0788568749\",\"openingBalance\":5,\"companyRegistrationDate\":\"19950317\",\"interestRateatDisbursement\":\"\",\"sectorOfActivity\":\"2700\",\"availableCredit\":\"0\",\"companyCeaseDate\":\"\",\"accountRepaymentTerm\":\"\",\"accountType\":\"\",\"currentBalance\":5,\"taxNumber\":\"100011916\",\"accountOwner\":\"P\",\"classification\":\"1\",\"physicalAddressDistrict\":\"\",\"scheduledPaymentAmount\":\"10.11\",\"actualPaymentAmount\":10.11,\"dateAccountOpened\":\"20221010\",\"daysinArrears\":\"\",\"physicalAddressProvince\":\"\",\"currentBalanceIndicator\":\"D\",\"postalAddressNumber\":\"\",\"installmentsinArrears\":\"0\",\"approvalDate\":\"20221010\",\"physicalAddressSector\":\"2700\",\"dateAccountClosed\":\"\",\"firstPaymentDate\":\"20221031\",\"industry\":\"1799\",\"dateClosed\":\"\",\"accountStatus\":\"A\",\"termsDuration\":\"\",\"lastPaymentDate\":\"\",\"physicalAddressCell\":\"OL02000145\",\"physicalAddressLine2\":\"KIGALI CITY\",\"tradingName\":\"FAIR CONSTRUCTION LTD\",\"physicalAddressLine1\":\"NYARUGENGE KIGALI CITY\",\"physicalAddressPostalCode\":\"3109 KIGALI\",\"companyRegistrationNumber\":\"\",\"nature\":\"23\",\"vatNo\":\"\",\"numberofLoanJoinParticipants\":\"\",\"accountNumber\":\"AA2228304WD0\",\"finalPaymentDate\":\"0\",\"amountPastDue\":0,\"category\":\"11\"},\"recordType\":\"CI\"}\n",
                "{\"corporateCreditInformationRecord\":{\"currencyType\":\"RWF\",\"country\":\"RW\",\"dateAccountUpdated\":\"20221103\",\"postalCode\":\"\",\"telephone3\":\"\",\"telephone2\":\"\",\"telephone1\":\"\",\"physicalAddressPlotNumber\":\"\",\"facsimile1\":\"\",\"facsimile2\":\"\",\"institution\":\"INYAMIBWA SHEMA SIMPLICE\",\"emailAddress\":\"\",\"telephone6\":\"\",\"telephone5\":\"\",\"telephone4\":\"\",\"openingBalance\":5000,\"companyRegistrationDate\":\"\",\"interestRateatDisbursement\":\"\",\"sectorOfActivity\":\"3620\",\"availableCredit\":\"0\",\"companyCeaseDate\":\"\",\"accountRepaymentTerm\":\"\",\"accountType\":\"\",\"currentBalance\":5000,\"taxNumber\":\"\",\"accountOwner\":\"P\",\"classification\":\"1\",\"physicalAddressDistrict\":\"\",\"scheduledPaymentAmount\":\"0\",\"actualPaymentAmount\":0,\"dateAccountOpened\":\"20221010\",\"daysinArrears\":\"\",\"physicalAddressProvince\":\"\",\"currentBalanceIndicator\":\"D\",\"postalAddressNumber\":\"\",\"installmentsinArrears\":\"2\",\"approvalDate\":\"20221010\",\"physicalAddressSector\":\"3620\",\"dateAccountClosed\":\"\",\"firstPaymentDate\":\"20221031\",\"industry\":\"4199\",\"dateClosed\":\"\",\"accountStatus\":\"A\",\"termsDuration\":\"\",\"lastPaymentDate\":\"\",\"physicalAddressCell\":\"\",\"physicalAddressLine2\":\"MUSANZE\",\"tradingName\":\"INYAMIBWA SHEMA SIMPLICE\",\"physicalAddressLine1\":\"MUSANZE MUSANZE\",\"physicalAddressPostalCode\":\"\",\"companyRegistrationNumber\":\"\",\"nature\":\"23\",\"vatNo\":\"\",\"numberofLoanJoinParticipants\":\"\",\"accountNumber\":\"AA2228321BY3\",\"finalPaymentDate\":\"0\",\"amountPastDue\":0,\"category\":\"11\"},\"recordType\":\"CI\"}\n",
                "{\"corporateCreditInformationRecord\":{\"currencyType\":\"RWF\",\"country\":\"RW\",\"dateAccountUpdated\":\"20221103\",\"postalCode\":\"\",\"telephone3\":\"\",\"telephone2\":\"\",\"telephone1\":\"\",\"physicalAddressPlotNumber\":\"\",\"facsimile1\":\"\",\"facsimile2\":\"\",\"institution\":\"TECH RAYS2017 LTD\",\"emailAddress\":\"contactus@bpr.rw\",\"telephone6\":\"\",\"telephone5\":\"\",\"telephone4\":\"\",\"openingBalance\":93354,\"companyRegistrationDate\":\"20170905\",\"interestRateatDisbursement\":\"\",\"sectorOfActivity\":\"6200\",\"availableCredit\":\"0\",\"companyCeaseDate\":\"\",\"accountRepaymentTerm\":\"\",\"accountType\":\"\",\"currentBalance\":93354,\"taxNumber\":\"\",\"accountOwner\":\"P\",\"classification\":\"1\",\"physicalAddressDistrict\":\"\",\"scheduledPaymentAmount\":\"0\",\"actualPaymentAmount\":0,\"dateAccountOpened\":\"20221010\",\"daysinArrears\":\"\",\"physicalAddressProvince\":\"\",\"currentBalanceIndicator\":\"D\",\"postalAddressNumber\":\"\",\"installmentsinArrears\":\"2\",\"approvalDate\":\"20221010\",\"physicalAddressSector\":\"6200\",\"dateAccountClosed\":\"\",\"firstPaymentDate\":\"20221031\",\"industry\":\"1603\",\"dateClosed\":\"\",\"accountStatus\":\"A\",\"termsDuration\":\"\",\"lastPaymentDate\":\"\",\"physicalAddressCell\":\"OL02000210\",\"physicalAddressLine2\":\"KIGALI\",\"tradingName\":\"TECH RAYS2017 LTD\",\"physicalAddressLine1\":\"NYARUGENGE KIGALI\",\"physicalAddressPostalCode\":\"\",\"companyRegistrationNumber\":\"\",\"nature\":\"23\",\"vatNo\":\"\",\"numberofLoanJoinParticipants\":\"\",\"accountNumber\":\"AA2228321NK4\",\"finalPaymentDate\":\"0\",\"amountPastDue\":0,\"category\":\"11\"},\"recordType\":\"CI\"}\n"
        ).collect(Collectors.toList());
        printAll(corporateRequests);
    }

    private static Blob prepareBlob(String payload) {
        byte[] byteData = payload.getBytes();
        Blob preparedBlob = null;
        try {
            preparedBlob = new SerialBlob(byteData);
        } catch (SQLException e) {
            System.out.println("ERROR:: " + e.getMessage());
        }

        return preparedBlob;
    }

    private static void printAll(List<String> payloadList) {
        payloadList.forEach(Main::printBlob);
    }

    private static void printBlob(String payload) {
        Blob blob = prepareBlob(payload);
        String convertedBlob = "";
        byte[] blobData = null;
        try {
            blobData = blob.getBytes(1, (int) blob.length());
            convertedBlob = new String(blobData);
        } catch (SQLException e){
            System.out.println("ERROR:: " + e.getMessage());
        }

//        System.out.println("BLOB: " + Arrays.toString(blobData));
        System.out.println("BLOB: " + convertedBlob);
    }

}