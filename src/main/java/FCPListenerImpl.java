import net.pterodactylus.fcp.*;

public class FCPListenerImpl implements FcpListener {

    @Override
    public void receivedNodeHello(FcpConnection fcpConnection, NodeHello nodeHello) {
        System.out.println("Hell yeah rubber ducker");
        nodeHello.getFCPVersion();

    }

    @Override
    public void receivedCloseConnectionDuplicateClientName(FcpConnection fcpConnection, CloseConnectionDuplicateClientName closeConnectionDuplicateClientName) {

    }

    @Override
    public void receivedSSKKeypair(FcpConnection fcpConnection, SSKKeypair sskKeypair) {

    }

    @Override
    public void receivedPeer(FcpConnection fcpConnection, Peer peer) {

    }

    @Override
    public void receivedEndListPeers(FcpConnection fcpConnection, EndListPeers endListPeers) {

    }

    @Override
    public void receivedPeerNote(FcpConnection fcpConnection, PeerNote peerNote) {

    }

    @Override
    public void receivedEndListPeerNotes(FcpConnection fcpConnection, EndListPeerNotes endListPeerNotes) {

    }

    @Override
    public void receivedPeerRemoved(FcpConnection fcpConnection, PeerRemoved peerRemoved) {

    }

    @Override
    public void receivedNodeData(FcpConnection fcpConnection, NodeData nodeData) {

    }

    @Override
    public void receivedTestDDAReply(FcpConnection fcpConnection, TestDDAReply testDDAReply) {

    }

    @Override
    public void receivedTestDDAComplete(FcpConnection fcpConnection, TestDDAComplete testDDAComplete) {

    }

    @Override
    public void receivedPersistentGet(FcpConnection fcpConnection, PersistentGet persistentGet) {

    }

    @Override
    public void receivedPersistentPut(FcpConnection fcpConnection, PersistentPut persistentPut) {

    }

    @Override
    public void receivedEndListPersistentRequests(FcpConnection fcpConnection, EndListPersistentRequests endListPersistentRequests) {

    }

    @Override
    public void receivedURIGenerated(FcpConnection fcpConnection, URIGenerated uriGenerated) {

    }

    @Override
    public void receivedDataFound(FcpConnection fcpConnection, DataFound dataFound) {

    }

    @Override
    public void receivedAllData(FcpConnection fcpConnection, AllData allData) {

    }

    @Override
    public void receivedSimpleProgress(FcpConnection fcpConnection, SimpleProgress simpleProgress) {

    }

    @Override
    public void receivedStartedCompression(FcpConnection fcpConnection, StartedCompression startedCompression) {

    }

    @Override
    public void receivedFinishedCompression(FcpConnection fcpConnection, FinishedCompression finishedCompression) {

    }

    @Override
    public void receivedUnknownPeerNoteType(FcpConnection fcpConnection, UnknownPeerNoteType unknownPeerNoteType) {

    }

    @Override
    public void receivedUnknownNodeIdentifier(FcpConnection fcpConnection, UnknownNodeIdentifier unknownNodeIdentifier) {

    }

    @Override
    public void receivedConfigData(FcpConnection fcpConnection, ConfigData configData) {

    }

    @Override
    public void receivedGetFailed(FcpConnection fcpConnection, GetFailed getFailed) {

    }

    @Override
    public void receivedPutFailed(FcpConnection fcpConnection, PutFailed putFailed) {

    }

    @Override
    public void receivedIdentifierCollision(FcpConnection fcpConnection, IdentifierCollision identifierCollision) {

    }

    @Override
    public void receivedPersistentPutDir(FcpConnection fcpConnection, PersistentPutDir persistentPutDir) {

    }

    @Override
    public void receivedPersistentRequestRemoved(FcpConnection fcpConnection, PersistentRequestRemoved persistentRequestRemoved) {

    }

    @Override
    public void receivedSubscribedUSK(FcpConnection fcpConnection, SubscribedUSK subscribedUSK) {

    }

    @Override
    public void receivedSubscribedUSKUpdate(FcpConnection fcpConnection, SubscribedUSKUpdate subscribedUSKUpdate) {

    }

    @Override
    public void receivedPluginInfo(FcpConnection fcpConnection, PluginInfo pluginInfo) {

    }

    @Override
    public void receivedPluginRemoved(FcpConnection fcpConnection, PluginRemoved pluginRemoved) {

    }

    @Override
    public void receivedFCPPluginReply(FcpConnection fcpConnection, FCPPluginReply fcpPluginReply) {

    }

    @Override
    public void receivedPersistentRequestModified(FcpConnection fcpConnection, PersistentRequestModified persistentRequestModified) {

    }

    @Override
    public void receivedPutSuccessful(FcpConnection fcpConnection, PutSuccessful putSuccessful) {

    }

    @Override
    public void receivedPutFetchable(FcpConnection fcpConnection, PutFetchable putFetchable) {

    }

    @Override
    public void receivedSentFeed(FcpConnection fcpConnection, SentFeed sentFeed) {

    }

    @Override
    public void receivedBookmarkFeed(FcpConnection fcpConnection, ReceivedBookmarkFeed receivedBookmarkFeed) {

    }

    @Override
    public void receivedProtocolError(FcpConnection fcpConnection, ProtocolError protocolError) {

    }

    @Override
    public void receivedMessage(FcpConnection fcpConnection, FcpMessage fcpMessage) {

    }

    @Override
    public void connectionClosed(FcpConnection fcpConnection, Throwable throwable) {

    }
}
